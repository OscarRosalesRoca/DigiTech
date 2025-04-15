//Función para crear DIV
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

//Función para crear H1
function crearH1 (padre, id, clase, texto){
    let titulo = document.createElement("h1");
    let contenido = document.createTextNode(texto);
    titulo.appendChild(contenido);
    if (id) {
        titulo.id=id;
    }
    if (clase) {
        imagen.classList.add(clase);
    }
    let parent = typeof padre === "string" ? document.getElementById(padre) || document.querySelector(padre) : padre;
    if (parent) {
        parent.appendChild(titulo);
    } else {
        console.error(`El elemento padre '${padre}' no existe`);
    }
};

//Función para crear P
function crearP (padre, id, clase, texto){
    let parrafo = document.createElement("p");
    let contenido = document.createTextNode(texto);
    parrafo.appendChild(contenido);
    if (id) {
        parrafo.id=id;
    }
    if (clase) {
        parrafo.classList.add(clase);
    }
    let parent = typeof padre === "string" ? document.getElementById(padre) || document.querySelector(padre) : padre;
    if (parent) {
        parent.appendChild(parrafo);
    } else {
        console.error(`El elemento padre '${padre}' no existe`);
    }
}

//Funcion para crear SELECT a través de un array de opciones
function crearSelect(padre, id, clase, nombre, opciones) {
    let select = document.createElement("select");
    select.name = nombre;
    if (id) {
        select.id=id;
    }
    if (clase) {
        select.classList.add(clase);
    }
    const opcionDefault = opciones.find(opcion => opcion.default);
    if (opcionDefault) {
        let opcionDef = document.createElement("option");
        opcionDef.value = opcionDefault.value;
        opcionDef.textContent = opcionDefault.text;
        opcionDef.selected = true; // Marcar como opción seleccionada
        select.appendChild(opcionDef); // Agregarla al select
    }
    opciones.forEach(opcion => {
        if (!opcion.default) { // Solo agregar las opciones que no son la por defecto
            let option = document.createElement("option");
            option.value = opcion.value;
            option.textContent = opcion.text;
            select.appendChild(option); // Agregar la opción al select
        }
    });
    let parent = typeof padre === "string" ? document.getElementById(padre) || document.querySelector(padre) : padre;
    if (parent) {
        parent.appendChild(select);
    } else {
        console.error(`El elemento padre '${padre}' no existe`);
    }
}

//Creamos la WEB
crearDiv("body", "fondo");
crearDiv("fondo", "titulo");
crearH1("titulo", "", "", "¿Dónde quieres viajar?");
crearP("titulo", "escribir", "", "");
crearDiv("fondo", "destino");
crearDiv("destino", "izquierda");
crearImagen("izquierda", "foto", "", "resources/default2.gif");
crearDiv("destino", "derecha");

const opciones = [
    { value: "defecto", text: "Escoge país:" },
    { value: "alemania", text: "Alemania" },
    { value: "españa", text: "España" },
    { value: "italia", text: "Italia" },
    { value: "paris", text: "París" },
    { value: "portugal", text: "Portugal" }
];

crearSelect("derecha", "eleccionPaises", "", "eleccionPaises", opciones);

//Funcionamiento de la WEB
const imagenes = [
    "resources/default2.gif",
    "resources/alemania.jpg",
    "resources/españa.jpeg",
    "resources/italia.jpg",
    "resources/paris.jpg",
    "resources/portugal.jpg"
];

const selector = document.getElementById("eleccionPaises");
const foto = document.getElementById("foto");
const escribir = document.getElementById("escribir");

selector.addEventListener("change", function (event) {
    const seleccion = event.target.value;
    switch (seleccion) {
        case "defecto":
            foto.setAttribute("src", imagenes[0]);
            escribir.innerHTML = " ";
            break;
        case "alemania":
            foto.setAttribute("src", imagenes[1]);
            escribir.innerHTML = "¡Su destino es Alemania!";
            break;
        case "españa":
            foto.setAttribute("src", imagenes[2]);
            escribir.innerHTML = "¡Su destino es España!";
            break;
        case "italia":
            foto.setAttribute("src", imagenes[3]);
            escribir.innerHTML = "¡Su destino es Italia!";
            break;
        case "paris":
            foto.setAttribute("src", imagenes[4]);
            escribir.innerHTML = "¡Su destino es París!";
            break;
        case "portugal":
            foto.setAttribute("src", imagenes[5]);
            escribir.innerHTML = "¡Su destino es Portugal!";
    }
});