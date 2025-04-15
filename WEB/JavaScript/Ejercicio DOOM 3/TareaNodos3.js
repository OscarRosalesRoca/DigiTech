/*
¿QUÉ NECESITAMOS?

Un div dentro del body que sea id=main
Un div dentro de main que sea id=superior
Un div dentro de main que sea id=inferior
Tres divs, uno al lado del otro con una imagen dentro de cada uno, dentro de superior
Tres divs, uno al lado del otro con un ancor dentro de cada uno, dentro de inferior

*/

function crearDiv (padre, id, clase){
    let div = document.createElement("div");
    if (id) {
        div.id = id;
    } 
    if (clase){
        div.classList.add(clase);
    }
    let parent = typeof padre === "string" ? document.getElementById(padre) || document.querySelector(padre) : padre;
    if (parent) {
        parent.appendChild(div);
    } else {
        console.error(`El elemento padre '${padre}' no existe`);
    }
}

//Función para crear IMG
function crearImagen (padre, id, clase, src){
    let imagen = document.createElement("img");
    imagen.src = src;
    if (id) {
        imagen.id = id;
    } 
    if (clase){
        imagen.classList.add(clase);
    }
    let parent = typeof padre === "string" ? document.getElementById(padre) || document.querySelector(padre) : padre;
    if (parent) {
        parent.appendChild(imagen);
    } else {
        console.error(`El elemento padre '${padre}' no existe`);
    }
};

//Función para crear ANCOR
function crearANCOR (padre, id, clase, link, texto){
    let ancor = document.createElement("a");
    let contenido = document.createTextNode(texto);
    ancor.appendChild(contenido);
    ancor.href = link;
    if (id) {
        ancor.id=id;
    }
    if (clase) {
        ancor.classList.add(clase);
    }
    let parent = typeof padre === "string" ? document.getElementById(padre) || document.querySelector(padre) : padre;
    if (parent) {
        parent.appendChild(ancor);
    } else {
        console.error(`El elemento padre '${padre}' no existe`);
    }
}

//Creación WEB
crearDiv("body", "main");
crearDiv("main", "superior");
crearDiv("main", "inferior");
crearDiv("superior", "", "divsSuperiores");
crearDiv("superior", "", "divsSuperiores");
crearDiv("superior", "", "divsSuperiores");
crearDiv("inferior", "", "divsInferiores");
crearDiv("inferior", "", "divsInferiores");
crearDiv("inferior", "", "divsInferiores");

//Automatización del proceso de creación de las imagenes
const superiores = document.querySelectorAll("#superior .divsSuperiores");
const animales = [
    "resources/leon.jpg",
    "resources/jirafa.jpg",
    "resources/loro.jpg"
];
for (let i = 0; i < animales.length; i++) {
    crearImagen(superiores[i], "" , "", animales[i]);
}

//Automatización de ANCORS
const inferiores = document.querySelectorAll("#inferior .divsInferiores");
const enlaces = [
    "https://es.wikipedia.org/wiki/Panthera_leo",
    "https://es.wikipedia.org/wiki/Giraffa_camelopardalis",
    "https://es.wikipedia.org/wiki/Psittacoidea"
];
const informacion = [
    "Información sobre los leones",
    "Información sobre las jirafas",
    "información sobre los loros"
]
for (let i = 0; i < enlaces.length; i++) {
    crearANCOR(inferiores[i], "", "", enlaces[i], informacion[i]);
}