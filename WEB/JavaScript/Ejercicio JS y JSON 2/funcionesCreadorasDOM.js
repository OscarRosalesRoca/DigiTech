//Función para crear un DIV
export function crearDiv (padre, id, clase){
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

//Función para crear un IMG
export function crearImagen (padre, id, clase, src){
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

//Función para crear un TÍTULO
export function crearTitulo (padre, id, clase, tipo, texto){
    let titulo = document.createElement(tipo);
    let contenido = document.createTextNode(texto);
    titulo.appendChild(contenido);
    if (id) {
        titulo.id=id;
    }
    if (clase) {
        titulo.classList.add(clase);
    }
    let parent = typeof padre === "string" ? document.getElementById(padre) || document.querySelector(padre) : padre;
    if (parent) {
        parent.appendChild(titulo);
    } else {
        console.error(`El elemento padre '${padre}' no existe`);
    }
};

//Función para crear un TEXTO
export function crearP (padre, id, clase, texto){
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

//Función para crear un ANCOR
export function crearANCOR (padre, id, clase, link, texto){
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

//Función para crear un botón
export function crearButton (padre, id, clase, texto){
    let button = document.createElement("button");
    let contenido = document.createTextNode(texto);
    button.appendChild(contenido);
    if (id) {
        button.id=id;
    }
    if (clase) {
        button.classList.add(clase);
    }
    let parent = typeof padre === "string" ? document.getElementById(padre) || document.querySelector(padre) : padre;
    if (parent) {
        parent.appendChild(button);
    } else {
        console.error(`El elemento padre '${padre}' no existe`);
    }
}