import{
    crearDiv,
    crearImagen,
    crearButton,
    crearTitulo,
    crearP,
    crearANCOR
} from './funcionesCreadorasDOM.js';

class Coche{
    //Constructor
    constructor(marca, modelo, kilometros, anyo, precio, motor, foto, disponibile){
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
        this.anyo = anyo;
        this.precio = precio;
        this.motor = motor;
        this.foto = foto;
        this.disponibile = disponibile;
    }

    mostramosCoches(index){
        let indice = index + 1;
        let numCoche = "coche" + indice;
        let disponibilidad = this.disponible;
        let siNo;
        if (disponibilidad) {
            siNo = "sí."
        } else {
            siNo = "no."
        }
        crearDiv("contenedor", numCoche, "coche");
        crearImagen(numCoche, "", "img", this.foto);
        crearTitulo(numCoche, "", "", "h2", this.marca);
        crearP(numCoche, "", "", this.modelo);
        crearP(numCoche, "", "", this.kilometros);
        crearP(numCoche, "", "", this.anyo);
        crearP(numCoche, "", "", this.precio);
        crearP(numCoche, "", "", this.motor);
        crearP(numCoche, "", "", "Disponibilidad: " + siNo);
    }
}

window.addEventListener("DOMContentLoaded", () => {
    //Creamos la conexión con AYAX
    let peticion = new XMLHttpRequest();
    peticion.onreadystatechange = continuar;
    peticion.open("GET", "información.json");
    peticion.send();

    function continuar(){
        if (peticion.readyState == 4 && peticion.status == 200) {
            //Guardamos lo que recibe nuestro JS del JSON en una variable que pasa a ser un ARRAY de [6]
            let datos = JSON.parse(peticion.responseText);

            //Comprobamos que hemos recibido bien enviando los datos a la consola
            console.log(datos);

            datos.forEach((coche, index) => {
                let cocheObjeto = new Coche(coche.marca, coche.modelo, coche.kilometros, coche.anyo, coche.precio, coche.motor, coche.foto, coche.disponibile);
                cocheObjeto.mostramosCoches(index);
            });
        }
    }
});