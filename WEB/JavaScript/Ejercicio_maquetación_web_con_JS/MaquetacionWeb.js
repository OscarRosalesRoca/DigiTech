/*
¿QUÉ NECESITAMOS?

- Un div con id = cabecera para poner el logo con id = logo
- Un div debajo de cabecera para poner el menú con id = menú poner los textos espaciados entre si
- Un div de contenido id = primerApartado con un padding 10px en todos lados dividido 
en dos divs class = primerApartado, uno con una imagen y otro con un título, párrafo y un botón. Hay un margin
entre los divs. 
- Un div de contenido id = segundoApartado y dentro un título y una imagen en formato horizontal que cubre el 100% del ancho del div
- Un div de contenido id = tercer apartado en forma de grid dividido en 3 divs, todos con padding general
y dentro una img, un párrafo y un botón

FUNCIONES:
- DIV
- IMG
- H1
- P
- BUTTON
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

function crearTitulo (padre, id, clase, tipo, texto){
    let titulo = document.createElement(tipo);
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

function crearButton (padre, id, clase, texto){
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

crearDiv("body", "cabecera");
crearImagen("cabecera", "logo", "", "resources/logo.jpg");
crearDiv("body", "menu");
crearP("menu", "", "", "Inicio");
crearP("menu", "", "", "Nosotros");
crearP("menu", "", "", "Servicios");
crearP("menu", "", "", "Contacto");
crearDiv("body", "primerApartado");
crearDiv("primerApartado", "primerApartado1");
crearDiv("primerApartado", "primerApartado2");
crearImagen("primerApartado1", "", "", "resources/arco.jpg");
crearTitulo("primerApartado2", "", "", "h3", "Este es el titular del div de texto");
crearP("primerApartado2", "", "", "Sant Feliu de Guíxols es un encantador pueblo costero de la Costa Brava, rodeado de calas de aguas cristalinas y naturaleza exuberante. Su paseo marítimo invita a disfrutar de atardeceres mágicos mientras se escucha el sonido de las olas. El Monasterio Benedictino y su Porta Ferrada reflejan su riqueza histórica y cultural. Sus calles empedradas y su puerto le dan un aire auténtico y acogedor. Es un destino perfecto para quienes buscan belleza, tranquilidad y tradición en un solo lugar.")
crearButton("primerApartado2", "", "", "Ver más");
crearDiv("body", "segundoApartado");
crearTitulo("segundoApartado", "", "", "h2", "Este es el titular del segundo apartado");
crearImagen("segundoApartado", "", "", "resources/nieve.jpg");

crearDiv("body", "tercerApartado");

crearDiv("tercerApartado", "tercerApartado1");
crearImagen("tercerApartado1", "", "", "resources/playa.jpg");
crearP("tercerApartado1", "", "", "Esto es una playa");
crearButton("tercerApartado1", "", "", "Ver más");

crearDiv("tercerApartado", "tercerApartado2");
crearImagen("tercerApartado2", "", "", "resources/kayak.jpeg");
crearP("tercerApartado2", "", "", "Esto es un kayak");
crearButton("tercerApartado2", "", "", "Ver más");

crearDiv("tercerApartado", "tercerApartado3");
crearImagen("tercerApartado3", "", "", "resources/avion.jpg");
crearP("tercerApartado3", "", "", "Esto es un avión");
crearButton("tercerApartado3", "", "", "Ver más");
