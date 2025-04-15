/*
EJERCICIO 1
const nombre = prompt("¿Qué nombre quieres imprimir por consola?");
const veces = prompt("¿Cuántas veces lo quieres escribir por consola?");
let contador = 0;

do {
    console.log(nombre);
    contador++;
} while (contador < veces);
*/


/*
EJERCICIO 2
console.log("1 ")
let contador = 0;
while (contador < 100) {
    contador += 10;
    console.log(contador+" ");
}
*/

/*
EJERCICIO 3
const columnas = prompt("¿Cuántas columnas quieres?");
const filas = prompt("¿Cuántas filas quieres?");

const tabla = [];
for (let i = 0; i < filas; i++) {
    tabla [i] = [];
    for (let j = 0; j < columnas; j++) {
        tabla[i][j] = Math.floor(Math.random()*10);
    }
}

console.log("La tabla generada es: ");
for (let i = 0; i < filas; i++) {
    let fila = " ";
    for (let j = 0; j < columnas; j++) {
        fila += tabla[i][j]+" ";
    }
    console.log(fila);
}
*/