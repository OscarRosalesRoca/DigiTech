function crearDiv (padre, id, clase){
    //Creamos un elemento div
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
    //Creamos un elemento img
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


//Creación de la página web 
crearDiv("body", "main");
crearDiv("main", "BigPictureContainer");
crearImagen("BigPictureContainer", "BigPicture", "", "");
crearDiv("main", "SmallPictureContainer");

// Lista de las rutas de las imágenes
const imagenes = [
    "resources/algarve1.jpg",
    "resources/playa1.jpg",
    "resources/playa2.jpg",
    "resources/playa3.jpg",
    "resources/montaña1.jpg",
    "resources/montaña2.jpg"
];

// 1. Crear los divs .img en el contenedor SmallPictureContainer
imagenes.forEach(() => {
    crearDiv("SmallPictureContainer", "", "img");
});

// 2. Obtener los divs con clase .img dentro de SmallPictureContainer
const conjuntoDivImagenes = document.querySelectorAll("#SmallPictureContainer .img");

// 3. Agregar las imágenes dentro de esos divs .img
imagenes.forEach((elemento, index) => {
    if (conjuntoDivImagenes[index]) { // Si el div .img existe
        crearImagen(conjuntoDivImagenes[index], "", "img", elemento); // Crear la imagen dentro del div correspondiente
    } else {
        console.error("No se encontró el div .img para la imagen", index);
    }
});

const smallImages = document.querySelectorAll("#SmallPictureContainer .img img"); 
const bigImage = document.getElementById("BigPicture"); 

smallImages.forEach((img) => {
    img.addEventListener("mouseover", function () {
        bigImage.src = img.src; 
    });
});