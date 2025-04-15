const numero = prompt("Escribe un número");
let condición = false;
if (numero !== 0 && numero > 0) {
    condición = true;
}

if (condición) {
    if (numero % 2 == 0) {
        alert("El numero: "+numero+" es par.");
    } else {
        alert("El numero: "+numero+" no es par.");
    }
} else {
    alert("Debe ser un número mayor que 0")
}
