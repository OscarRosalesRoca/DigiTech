import{
    crearDiv,
    crearImagen,
    crearTitulo,
    crearP,
    crearVideo
} from './funcionesCreadorasDOM.js';

window.addEventListener("DOMContentLoaded", () => {
    //Creamos la conexión con AJAX
    let peticion = new XMLHttpRequest();
    peticion.open("GET", "peliculas.xml");
    peticion.send();

    peticion.onreadystatechange = function(){
        if (peticion.readyState == 4 && peticion.status == 200) {
            // Convertimos el XML en un objeto DOM
            let parser = new DOMParser();
            let xmlDocument = parser.parseFromString(peticion.responseText, "text/xml");

            // Obtenemos la lista de películas
            let peliculas = xmlDocument.getElementsByTagName("pelicula");

            // Creamos un objeto array para almacenar los datos
            let datos = [];

            // Iteramos sobre las películas y extraemos la información
            for (let i = 0; i < peliculas.length; i++) {
                let pelicula = peliculas[i];
                let titulo = pelicula.getElementsByTagName("titulo")[0].textContent;
                let direccion = pelicula.getElementsByTagName("direccion")[0].textContent;
                let duracion = pelicula.getElementsByTagName("duracion")[0].textContent;
                let nacionalidad = pelicula.getElementsByTagName("nacionalidad")[0].textContent;
                let actores = pelicula.getElementsByTagName("actores")[0].textContent;
                let genero = pelicula.getElementsByTagName("genero")[0].textContent;
                let sinopsis = pelicula.getElementsByTagName("sinopsis")[0].textContent;
                let trailer = pelicula.getElementsByTagName("trailer")[0].textContent;

                // Almacenamos la información en un objeto
                datos.push({
                    titulo,
                    direccion,
                    duracion,
                    nacionalidad,
                    actores,
                    genero,
                    sinopsis,
                    trailer
                });
            }
            // Mostramos los datos en la consola
            console.log(datos);

            let img_peliculas = [];

            datos.forEach(pelicula => {
                img_peliculas.push(pelicula.titulo + ".jpg");
            });
            console.log(img_peliculas)

            //Creamos la web a partir de datos
            //Parte de la izquierda
            const contenedor = document.getElementById("left");
            const tabla = document.createElement("table");
            const tbody = document.createElement("tbody");

            let fila = null;

            datos.forEach((pelicula, index) => {
                if (index % 2 === 0) {
                    fila = document.createElement("tr");
                    tbody.appendChild(fila);
                }

                const square = document.createElement("td");
                const div = document.createElement("div");
                crearImagen(div, "", "img_left", "resources/" + img_peliculas[index]);
                crearP(div, "", "p_left", pelicula.titulo);
                square.appendChild(div)
                fila.appendChild(square);

                square.addEventListener("click", function(){
                    mostrarInfoPelicula(pelicula);
                });
            });
            tabla.appendChild(tbody);
            contenedor.appendChild(tabla);

            mostrarInfoPelicula(datos[0]);
        }};
    peticion.onerror = function () {
        console.error("Error al cargar el archivo XML.");
    };
});

function mostrarInfoPelicula(pelicula) {
    // Limpiar el div "main_right" antes de agregar la nueva información
    const mainRight = document.getElementById("main_right");
    mainRight.innerHTML = '';
    // Crear y agregar la información de la película seleccionada
    crearTitulo("main_right", "", "", "h1", pelicula.titulo);
    crearVideo("main_right", "video", "", pelicula.trailer);
    crearP("main_right", "", "p_right", "Dirección: " + pelicula.direccion);
    crearP("main_right", "", "p_right", "Duración: " + pelicula.duracion);
    crearP("main_right", "", "p_right", "Nacionalidad: " + pelicula.nacionalidad);
    crearP("main_right", "", "p_right", "Actores: " + pelicula.actores);
    crearP("main_right", "", "p_right", "Género: " + pelicula.genero);
    crearP("main_right", "", "p_right", "Sinopsis: " + pelicula.sinopsis);
}