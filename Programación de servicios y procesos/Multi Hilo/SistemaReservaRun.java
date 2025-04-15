import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Room {

    private final int MAX_CAPACITIE = 4;
    private int room1, room2, room3;
    private final Queue<Thread> waitingQueue = new LinkedList<>();

    public Room(){
        this.room1 = 0;
        this.room2 = 0;
        this.room3 = 0;
    }

    public synchronized void waitToEnterRoom(Student student){
        while (studentsInRoom(student.getPreferredRoom()) == MAX_CAPACITIE) {
            try {
                System.out.printf("Estudiante esperando para entrar a la sala %d\n", student.getPreferredRoom());
                waitingQueue.add(Thread.currentThread());
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        waitingQueue.remove(Thread.currentThread());
    }

    public synchronized void studentEnterToRoom(int roomNumber){
        switch (roomNumber) {
            case 1:
                room1++;
                break;
            case 2:
                room2++;
                break;
            case 3:
                room3++;
                break;
        }
    }

    public synchronized void studentLeaveRoom(int roomNumber){
        switch (roomNumber) {
            case 1:
                room1--;
                break;
            case 2:
                room2--;
                break;
            case 3:
                room3--;
                break;
        }
        notifyAll();
    }

    public synchronized int studentsInRoom(int roomNumber){
        switch (roomNumber) {
            case 1:
                return room1;
            case 2:
                return room2;
            case 3:
                return room3;
            default:
                return -1;
        }
    }

    @Override
    public String toString() {
        return String.format("[Room1: %d, Room2: %d, Room3: %d]", room1, room2, room3);
    }
}


class Student implements Runnable {

    private Room room;
    private int preferredRoom;
    private int studyTime;

    public Student(Room room){
        Random random = new Random();
        this.room = room;
        this.preferredRoom = random.nextInt(3) + 1; 
        this.studyTime = random.nextInt(5) + 1;
    }

    public int getPreferredRoom(){
        return preferredRoom;
    }

    public int getStudyTime(){
        return studyTime;
    }

    @Override
    public void run(){
        System.out.printf("Ha llegado un estudiante y está intentando reservar en la sala %d.\n", preferredRoom);
        room.waitToEnterRoom(this);

        synchronized (room) {
            room.studentEnterToRoom(preferredRoom);
            System.out.printf("Un estudiante ha entrado a la sala %d durante %d segundos.\n", preferredRoom, studyTime);
            System.out.printf("Estudiantes en la sala %d: %d\n", preferredRoom, room.studentsInRoom(preferredRoom));
        }

        try {
            Thread.sleep((long) (studyTime * 1000)); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Un estudiante ha terminado de estudiar y sale de la sala %d\n", preferredRoom);

        synchronized (room) {
            room.studentLeaveRoom(preferredRoom);
            System.out.printf("Estudiantes en la sala %d: %d\n", preferredRoom, room.studentsInRoom(preferredRoom));
        }
    }
}


public class SistemaReservaRun {
    public static void main(String[] args) {

        final int TOTAL_STUDENTS = 20;

        Room room = new Room();

        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            Thread student = new Thread(new Student(room));
            student.start();
        }
    }
}