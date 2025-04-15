// Importamos las funciones del archivo funcionesCreadorasDOM.js
import { 
    crearImagen, 
    crearP
} from './funcionesCreadorasDOM.js';

window.addEventListener('DOMContentLoaded', () => {
    fetch('informacion.json').then(response => response.json()).then(data => {
            //Crear el contenedor de la tabla
            const contenedor = document.getElementById("tablaPersonas");

            //Crear la tabla
            const tabla = document.createElement("table");

            //Crear el cuerpo de la tabla
            const tbody = document.createElement("tbody");

            //Crear las filas y celdas basadas en los datos del JSON
            let fila = null;

            data.forEach((persona, index) => {
                //Cada 3 personas crear una nueva fila
                if (index % 3 === 0) {
                    fila = document.createElement("tr");
                    tbody.appendChild(fila);
                }

                //Crear celdas para la persona
                const celda = document.createElement("td");

                //Crear div que contendrá: imagen, nombre, edad y sexo
                const div = document.createElement("div");

                //Crear la imagen de la persona
                crearImagen(div, null, "persona-imagen", persona.imagen);

                //Crear el nombre
                crearP(div, null, "persona-nombre", `Nombre: ${persona.nombre}`);

                //Crear la edad
                crearP(div, null, "persona-edad", `Edad: ${persona.edad}`);

                //Crear el sexo
                crearP(div, null, "persona-sexo", `Sexo: ${persona.sexo}`);

                //Agregar la información a la celda
                celda.appendChild(div);

                //Agregar la celda a la fila
                fila.appendChild(celda);
            });

            //Agregar el cuerpo de la tabla a la tabla
            tabla.appendChild(tbody);

            //Agregar la tabla al contenedor en el HTML
            contenedor.appendChild(tabla);
        })
    .catch(error => console.error("Error al cargar el JSON:", error));
});