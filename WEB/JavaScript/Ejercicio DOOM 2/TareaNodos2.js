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
