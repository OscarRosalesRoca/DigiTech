const euros = prompt("Escribe una cantidad de dinero en EUROS:");
const indiceDeCambioEuroLibra = 1*0.87;
const libras = euros * indiceDeCambioEuroLibra;
const p = document.getElementsByTagName("p")[0];
p.innerHTML = "Tu cantidad de EUROS: "+euros+" en LIBRAS es de: "+libras;