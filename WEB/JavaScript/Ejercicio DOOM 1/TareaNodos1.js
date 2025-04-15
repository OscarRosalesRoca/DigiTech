let precioPrimerPlato = 0;
let precioSegundoPlato = 0;
let precioPostre = 0;
let precioTotal = 0;
const descuento = 0.1;
let precioPagar = precioTotal * descuento;
var auxiliar = 0;

const primerosPlatos = {
    "porDefecto":"resources/porDefecto.jpg",
    "primerPlato1":"resources/ensalada.jpg",
    "primerPlato2":"resources/verduras.jpg"
}

const segundosPlatos = {
    "porDefecto":"resources/porDefecto.jpg",
    "segundoPlato1":"resources/pescado.jpg",
    "segundoPlato2":"resources/carne.jpg"
}
const postres = {
    "porDefecto":"resources/porDefecto.jpg",
    "postre1":"resources/torrija.jpg",
    "postre2":"resources/tartaQueso.jpg"
}

const selectPrimerPlato = document.getElementById("primerPlato");
const imagenPrimerPlato = document.getElementById("IMGprimero");

const selectSegundoPlato = document.getElementById("segundoPlato");
const imagenSegundoPlato = document.getElementById("IMGsegundo");

const selectPostre = document.getElementById("postre");
const imagenPostre = document.getElementById("IMGpostre");

selectPrimerPlato.addEventListener("change", function(event){
    const seleccion1 = event.target.value;
    imagenPrimerPlato.src = primerosPlatos[seleccion1];
    switch (seleccion1) {
        case "porDefecto":
            precioPrimerPlato = 0;
            break;
        case "primerPlato1":
            precioPrimerPlato = 6;
            break;
        case "primerPlato2":
            precioPrimerPlato = 8;
    }
    actualizarPrecioTotal();
    auxiliar++;
});

selectSegundoPlato.addEventListener("change", function(event){
    const seleccion2 = event.target.value;
    imagenSegundoPlato.src = segundosPlatos[seleccion2];
    switch (seleccion2) {
        case "porDefecto":
            precioSegundoPlato = 0;
            break;
        case "segundoPlato1":
            precioSegundoPlato = 12;
            break;
        case "segundoPlato2":
            precioSegundoPlato = 15;
    }
    actualizarPrecioTotal();
    auxiliar++;
});

selectPostre.addEventListener("change", function(event){
    const seleccion3 = event.target.value;
    imagenPostre.src = postres[seleccion3];
    switch (seleccion3) {
        case "porDefecto":
            precioPostre = 0;
            break;
        case "segundoPlato1":
            precioPostre = 3.5;
            break;
        case "segundoPlato2":
            precioPostre = 5.5;
    }
    actualizarPrecioTotal();
    auxiliar++;
});

function actualizarPrecioTotal(){
    precioTotal = precioPrimerPlato + precioSegundoPlato + precioPostre;
}

const selectParrafo = document.getElementById("pagar");
const Boton = document.getElementById("calcular");

Boton.addEventListener("click", function () {
    const checkboxDescuento = document.querySelector("input[name='descuento']");

    if (auxiliar === 3) { 
        if (checkboxDescuento.checked) {
            precioPagar = precioTotal * (1 - descuento);
        } else {
            precioPagar = precioTotal;
        }
        selectParrafo.textContent = "El precio a pagar serán: "+precioPagar+" €";
    } else {
        selectParrafo.textContent = "Por favor, selecciona las opciones de cada plato.";
    }
});