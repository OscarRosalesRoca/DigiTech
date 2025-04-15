const numero = prompt("Escribe un número");
let condición = false;
if (numero !== 0 && numero > 0) {
    condición = true;
}

if (condición) {
    if (numero > 9){
        if (numero % 2 == 0) {
            alert("El número "+numero+" es par");
        } else {
            alert("El número "+numero+" no es par");
        }
        if (numero > 99 && numero < 999) {
            resto = numero % 2;
            alert("El resto de dividir el número "+numero+" entre 2 es de "+resto);
        }
    }
} else {
    alert("ERROR")
}
