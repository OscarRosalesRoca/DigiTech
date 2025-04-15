const cantidad = prompt("¿Cuántas celdas quieres en el array?");
const tabla = [cantidad];

if (cantidad == 10) {
    for (let i = 0; i < cantidad; i++) {
        tabla[i] = i;
    }
} else {
    for (let i = 0; i < cantidad; i++) {
        tabla[i] = Math.floor(Math.random()*10); 
    }
}

console.log("Tu array es: ");
console.log("Bucle for ->");

for (let i = 0; i < tabla.length; i++) {
    console.log(tabla[i]);
}


