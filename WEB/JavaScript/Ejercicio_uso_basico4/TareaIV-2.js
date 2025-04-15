const galeria = [
    "resources/1.jpg",
    "resources/2.jpg",
    "resources/3.jpg",
    "resources/4.jpg",
    "resources/5.jpg"
];

const eleccion = parseInt(prompt("¿Qué imagen deseas imprimir?"));

switch (eleccion) {
    case 1:
        document.getElementById("1").src = galeria[eleccion-1];
        break;
    case 2:
        document.getElementById("2").src = galeria[eleccion-1];
        break;
    case 3:
        document.getElementById("3").src = galeria[eleccion-1];
        break;
    case 4:
        document.getElementById("4").src = galeria[eleccion-1];
        break;
    case 5:
        document.getElementById("5").src = galeria[eleccion-1];
        break;
    default:
        alert("Por favor, introduce un número del 1 al 5.");
        break;
}
