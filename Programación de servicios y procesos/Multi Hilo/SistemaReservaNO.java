import java.util.Random;

class Room {

    private int room1, room2, room3;
    private final int MAX_CAPACITIE = 4;

    public Room(){
        this.room1 = 0;
        this.room2 = 0;
        this.room3 = 0;
    }

    public synchronized void enterToRoom(Student student){
        int roomNumberStudent = student.getPreferredRoom();
        int studyTime = student.getStudyTime();

        // Esperar hasta que haya espacio en la sala elegida
        while (!canEnterRoom(roomNumberStudent)) {
            try {
                wait(); // Se pone en espera hasta que alguien libere espacio
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Una vez que hay espacio, el estudiante entra
        increaseRoomCount(roomNumberStudent);
        
        System.out.printf("Un estudiante ha podido entrar en la sala %d y procede a estudiar %d segundos.%n",
                roomNumberStudent, studyTime);
        System.out.printf("Personas en la sala %d: %d%n", roomNumberStudent, getRoomCount(roomNumberStudent));

        try {
            Thread.sleep(studyTime * 1000); // Simula el tiempo de estudio
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Un estudiante ha terminado su estudio y sale de la sala %d.%n", roomNumberStudent);
        decreaseRoomCount(roomNumberStudent);

        notifyAll();
    }

    private boolean canEnterRoom(int roomNumber) {
        return (roomNumber == 1 && room1 < MAX_CAPACITIE) ||
            (roomNumber == 2 && room2 < MAX_CAPACITIE) ||
            (roomNumber == 3 && room3 < MAX_CAPACITIE);
    }
    
    private void increaseRoomCount(int roomNumber) {
        if (roomNumber == 1) room1++;
        else if (roomNumber == 2) room2++;
        else if (roomNumber == 3) room3++;
    }
    
    private void decreaseRoomCount(int roomNumber) {
        if (roomNumber == 1) room1--;
        else if (roomNumber == 2) room2--;
        else if (roomNumber == 3) room3--;
    }
    
    private int getRoomCount(int roomNumber) {
        return (roomNumber == 1) ? room1 :
            (roomNumber == 2) ? room2 :
            (roomNumber == 3) ? room3 : -1;
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
        this.studyTime = random.nextInt(15) + 1;
    }

    public int getPreferredRoom(){
        return preferredRoom;
    }

    public int getStudyTime(){
        return studyTime;
    }

    @Override
    public void run(){
        System.out.printf("Ha llegado un estudiante y está intentando reservar en la sala %s.\n", preferredRoom);
        room.enterToRoom(this);
    }

}


public class SistemaReservaNO {
    public static void main(String[] args) {
        Random random = new Random();
        final long TIME_EXECUTION = System.currentTimeMillis() + 4 * 60 * 1000; //3 min

        Room room = new Room();

        while (System.currentTimeMillis() < TIME_EXECUTION) {
            int delayStudentGeneration = random.nextInt(3) + 1;
            try {
                Thread.sleep(delayStudentGeneration * 1000);
                Thread student = new Thread(new Student(room));
                student.start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*

import java.util.Random;

class Room {

    private int room1, room2, room3;
    private final int MAX_CAPACITIE = 4;

    public Room(){
        this.room1 = 0;
        this.room2 = 0;
        this.room3 = 0;
    }

    public synchronized void enterToRoom(Student student){
        int roomNumberStudent = student.getPreferredRoom();
        int studyTime = student.getStudyTime();
        while (true) { 
            if (roomNumberStudent == 1 && room1 < MAX_CAPACITIE) {
                studentEnterRoom1();
                System.out.printf("Un estudiante ha podido entrar en la sala %s y procede a estudiar %d segundos\n"
                , roomNumberStudent, studyTime);
                System.out.printf("Personas en la sala %s: %d\n", roomNumberStudent, room1);
                try {
                    Thread.sleep(studyTime * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("Un estudiante ha terminado su estudio y sale de la sala %s\n", roomNumberStudent);
                studentLeaveRoom1();
                break;
            } else if (roomNumberStudent == 2 && room2 < MAX_CAPACITIE) {
                studentEnterRoom2();
                System.out.printf("Un estudiante ha podido entrar en la sala %s y procede a estudiar %d segundos\n"
                , roomNumberStudent, studyTime);
                System.out.printf("Personas en la sala %s: %d\n", roomNumberStudent, room2);
                try {
                    Thread.sleep(studyTime * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("Un estudiante ha terminado su estudio y sale de la sala %s\n", roomNumberStudent);
                studentLeaveRoom2();
                break;
            } else if (roomNumberStudent == 3 && room3 < MAX_CAPACITIE) {
                studentEnterRoom3();
                System.out.printf("Un estudiante ha podido entrar en la sala %s y procede a estudiar %d segundos\n"
                , roomNumberStudent, studyTime);
                System.out.printf("Personas en la sala %s: %d\n", roomNumberStudent, room3);
                try {
                    Thread.sleep(studyTime * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("Un estudiante ha terminado su estudio y sale de la sala %s", roomNumberStudent);
                studentLeaveRoom3();
                break;
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void studentEnterRoom1(){
        room1++;
    }

    public synchronized void studentEnterRoom2(){
        room2++;
    }

    public synchronized void studentEnterRoom3(){
        room3++;
    }

    public synchronized void studentLeaveRoom1(){
        room1--;
        notifyAll();
    }

    public synchronized void studentLeaveRoom2(){
        room2--;
        notifyAll();
    }

    public synchronized void studentLeaveRoom3(){
        room3--;
        notifyAll();
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
        this.studyTime = random.nextInt(15) + 1;
    }

    public int getPreferredRoom(){
        return preferredRoom;
    }

    public int getStudyTime(){
        return studyTime;
    }

    @Override
    public void run(){
        System.out.printf("Ha llegado un estudiante y está intentando reservar en la sala %s.\n", preferredRoom);
        room.enterToRoom(this);
    }

}


public class Prueba {
    public static void main(String[] args) {
        Random random = new Random();
        final long TIME_EXECUTION = System.currentTimeMillis() + 4 * 60 * 1000; //3 min

        Room room = new Room();

        while (System.currentTimeMillis() < TIME_EXECUTION) {
            int delayStudentGeneration = random.nextInt(3) + 1;
            try {
                Thread.sleep(delayStudentGeneration * 1000);
                Thread student = new Thread(new Student(room));
                student.start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
    
 */