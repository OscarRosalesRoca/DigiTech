import{
    crearDiv,
    crearImagen,
    crearButton,
    crearTitulo,
    crearP,
    crearANCOR
} from './funcionesCreadorasDOM.js';

window.addEventListener("DOMContentLoaded", () => {
    //Creamos la conexión con AYAX
    let peticion = new XMLHttpRequest();
    peticion.open("GET", "información.json");
    peticion.send();

    peticion.onreadystatechange = function(){
        if (peticion.readyState == 4 && peticion.status == 200) {
            //Guardamos lo que recibe nuestro JS del JSON en una variable que pasa a ser un ARRAY de [6]
            let datos = JSON.parse(peticion.responseText);

            //Comprobamos que hemos recibido bien enviando los datos a la consola
            console.log(datos);

            datos.forEach((coche, index) => {
                let indice = index + 1;
                let numCoche = "coche" + indice;
                let rutaIMG = coche.foto;
                let disponibilidad = coche.disponible;
                let siNo;
                if (disponibilidad) {
                    siNo = "sí."
                } else {
                    siNo = "no."
                }
                crearDiv("contenedor", numCoche, "coche");
                crearImagen(numCoche, "", "img", rutaIMG);
                crearTitulo(numCoche, "", "", "h2", coche.marca);
                crearP(numCoche, "", "", coche.modelo);
                crearP(numCoche, "", "", coche.kilometros);
                crearP(numCoche, "", "", coche.anyo);
                crearP(numCoche, "", "", coche.precio);
                crearP(numCoche, "", "", coche.motor);
                crearP(numCoche, "", "", "Disponibilidad: " + siNo);
            });
        }
    }
});