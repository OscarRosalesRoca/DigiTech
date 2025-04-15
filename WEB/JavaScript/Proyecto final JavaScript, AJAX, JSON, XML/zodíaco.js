import{
    crearDiv,
    crearImagen,
    crearVideo,
    crearTitulo,
    crearP,
    crearButton,
    crearFecha
} from './funcionesCreadorasDOM.js';

window.addEventListener("DOMContentLoaded", () => {
    //Creamos la coneción con AJAX
    let peticion = new XMLHttpRequest();
    peticion.open("GET", "zodíaco.xml");
    peticion.send();

    let signosOccidentales = {};
    let signosOrientales = {};
    let periodoOrientales = {};

    peticion.onreadystatechange = function(){
        if (peticion.readyState == 4 && peticion.status == 200) {
            //--------------------------------------------------
            //Obtenemos la información del XML a los tres objetos DOM
            let parser = new DOMParser();
            let xmlDocument = parser.parseFromString(peticion.responseText, "text/xml");

            let signos = xmlDocument.getElementsByTagName("signo");

            for (let i = 0; i < signos.length; i++) {
                let nombre = signos[i].getAttribute("nombre");
                let periodoElement = signos[i].getElementsByTagName("periodo")[0];
                let descripcionElement = signos[i].getElementsByTagName("descripcion")[0];

                //Comprobamos que tenemos esta info
                let periodo = periodoElement ? periodoElement.textContent : "";
                let descripcion = descripcionElement ? descripcionElement.textContent : "";

                //Si coincide con los nombres del zodiaco los metemos en "signosOccidentales"
                if (["Aries", "Tauro", "Géminis", "Cáncer", "Leo", "Virgo", "Libra", "Escorpio", "Sagitario", "Capricornio",
                    "Acuario", "Piscis"].includes(nombre)) {
                    signosOccidentales[nombre] = {
                        periodo: periodo,
                        descripcion: descripcion
                    }
                }

                //Si coincide con los nombres del horóscopo chino los metemos en "signosOrientales"
                if (["Rata", "Buey", "Tigre", "Conejo", "Dragón", "Serpiente", "Caballo", "Cabra", "Mono", "Gallo", 
                    "Perro", "Cerdo"].includes(nombre)) {
                    signosOrientales[nombre] = {
                        periodo: periodo,
                        descripcion: descripcion
                    }

                    //Guardamos en "periodoOrientales" una lista de años a cada signo
                    let anios = periodo.split(", ");
                    periodoOrientales[nombre] = {
                        periodo: anios
                    }
                }
            }

            //Comprobamos por consola todo
            console.log(signosOccidentales); //Es una comprobación que se puede eliminar
            console.log(signosOrientales); //Es una comprobación que se puede eliminar


            //----------------------------------------------------------------------------------
            //Una vez tenemos la info de los signos, construimos la web y preguntamos al USUARIO
            crearDiv("body", "divPregunta", "");
            crearTitulo("divPregunta", "", "hPregunta", "h1", "¿Quieres saber cuál es tu signo del zodiaco y tu signo chino?");
            crearDiv("divPregunta", "divFecha", "");
            crearP("divFecha", "", "pPregunta", "Selecciona tu fecha de nacimiento:");
            crearFecha("divFecha", "date", "");
            crearButton("divPregunta", "", "buttonPreguntar", "Comprobar");

            //Capturamos la fecha
            let inputFecha = document.getElementById("date");
            let botonComprobar = document.getElementsByTagName("button")[0];

            //Comprobamos las fechas del usuario
            botonComprobar.addEventListener("click", () => {
                limpiarContenido();
                
                let fechaNacimiento = inputFecha.value;
                //Rompemos el inputFecha en una lista de longitud = 3
                let fechaNacimientoSeparada = fechaNacimiento.split("-")
                let fecha = new Date(fechaNacimiento);
                let mesUsuario = fecha.getMonth() + 1;
                let diaUsuario = fecha.getDate();


                //Signo Occidental
                let signoOccidentalUsuario = obtenerSignoZodiaco(mesUsuario, diaUsuario);
                crearDiv("body", "divTuSigno", "");
                crearP("divTuSigno", "", "pPregunta", "Tu signo del zodiaco es: " + signoOccidentalUsuario);

                //Signo Oriental
                let signoOrientalUsuario = obtenerSignoChino(fechaNacimientoSeparada[0]);
                crearP("divTuSigno", "", "pPregunta", "Tu horoscopo chino es: " + signoOrientalUsuario);


                //----------------------------------------------------------------------------------------------
                //Una vez tenemos los signos del USUARIO mostramos todos los signos y la información del usuario
                mostrarSignosDelZodiaco(signoOccidentalUsuario, signoOrientalUsuario);
            });
        }};
    peticion.onerror = function(){
        console.error("Error al cargar el archivo XML.")
    };

    function limpiarContenido() {
        // Seleccionamos todos los contenedores por su id
        let divTuSigno = document.getElementById("divTuSigno");
        let divZodiaco = document.getElementById("divZodiaco");
        let divChino = document.getElementById("divChino");
    
        if (divTuSigno) {
            divTuSigno.remove();
        }

        if (divZodiaco) {
            divZodiaco.remove();  // Elimina el contenedor divZodiaco completamente
        }
    
        if (divChino) {
            divChino.remove();  // Elimina el contenedor divChino completamente
        }
    }

    function obtenerSignoZodiaco(mes, dia) {
        
        let signo = "";

        // Aries (del 21 de marzo al 19 de abril)
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
        }
        // Tauro (del 20 de abril al 20 de mayo)
        else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
        }
        // Géminis (del 21 de mayo al 20 de junio)
        else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Géminis";
        }
        // Cáncer (del 21 de junio al 22 de julio)
        else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cáncer";
        }
        // Leo (del 23 de julio al 22 de agosto)
        else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leo";
        }
        // Virgo (del 23 de agosto al 22 de septiembre)
        else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
        }
        // Libra (del 23 de septiembre al 22 de octubre)
        else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        }
        // Escorpio (del 23 de octubre al 21 de noviembre)
        else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";
        }
        // Sagitario (del 22 de noviembre al 21 de diciembre)
        else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
        }
        // Capricornio (del 22 de diciembre al 19 de enero)
        else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricornio";
        }
        // Acuario (del 20 de enero al 18 de febrero)
        else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
        }
        // Piscis (del 19 de febrero al 20 de marzo)
        else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
        }

        return signo;
    }

    function obtenerSignoChino(anioUsuario){
        let signoChinoUsuario = "";
    
        for (let nombre in periodoOrientales){
            let aniosPeriodo = periodoOrientales[nombre].periodo;
    
            if (aniosPeriodo.includes(anioUsuario)) {
                signoChinoUsuario = nombre;
                break;
            }
        }
    
        return signoChinoUsuario || "No se encontró el signo para el año dado"
    }

    function mostrarSignosDelZodiaco(signoOccidentalUsuario, signoOrientalUsuario){
        // Crear div Zodiaco
        crearDiv("body", "divZodiaco", "");

        // Div izquierdo: tabla con los 12 signos del zodiaco
        crearDiv("divZodiaco", "divIzquierdoZodiaco", "");
        crearTitulo("divIzquierdoZodiaco", "", "hIzquierdo", "h2", "Signos del Zodiaco");
        crearTablaSignosZodiaco("divIzquierdoZodiaco");
        
        // Div derecho: información del signo del usuario
        crearDiv("divZodiaco", "divDerechoZodiaco", "");
        crearTitulo("divDerechoZodiaco", "", "hDerecho", "h2", "Tu signo");
        crearInformacionSigno("divDerechoZodiaco", signoOccidentalUsuario);

        // Crear div horóscopo Chino
        crearDiv("body", "divChino", "");
        
        // Div izquierdo: tabla con los 12 signos del horóscopo chino
        crearDiv("divChino", "divIzquierdoChino", "");
        crearTitulo("divIzquierdoChino", "", "hIzquierdo", "h2", "Signos del horóscopo Chino");
        crearTablaHoroscopoChino("divIzquierdoChino");
        
        // Div derecho: información del signo del usuario
        crearDiv("divChino", "divDerechoChino", "");
        crearTitulo("divDerechoChino", "", "hDerecho", "h2", "Tu horóscopo");
        crearInformacionHoroscopo("divDerechoChino", signoOrientalUsuario);

    }
        
    // Función para crear la tabla de los signos del zodiaco con sus imágenes
    function crearTablaSignosZodiaco(contenedor) {
        let tabla = document.createElement("table");

        let signosZodiaco = [
            { nombre: "Aries", imagen: "resources/signos_zodiaco/aries.png", periodo: "21 Mar - 19 Abr" },
            { nombre: "Tauro", imagen: "resources/signos_zodiaco/tauro.png", periodo: "20 Abr - 20 May" },
            { nombre: "Géminis", imagen: "resources/signos_zodiaco/geminis.png", periodo: "21 May - 20 Jun" },
            { nombre: "Cáncer", imagen: "resources/signos_zodiaco/cancer.png", periodo: "21 Jun - 22 Jul" },
            { nombre: "Leo", imagen: "resources/signos_zodiaco/leo.png", periodo: "23 Jul - 22 Ago" },
            { nombre: "Virgo", imagen: "resources/signos_zodiaco/virgo.png", periodo: "23 Ago - 22 Sep" },
            { nombre: "Libra", imagen: "resources/signos_zodiaco/libra.png", periodo: "23 Sep - 22 Oct" },
            { nombre: "Escorpio", imagen: "resources/signos_zodiaco/escorpio.png", periodo: "23 Oct - 21 Nov" },
            { nombre: "Sagitario", imagen: "resources/signos_zodiaco/sagitario.png", periodo: "22 Nov - 21 Dic" },
            { nombre: "Capricornio", imagen: "resources/signos_zodiaco/capricornio.png", periodo: "22 Dic - 19 Ene" },
            { nombre: "Acuario", imagen: "resources/signos_zodiaco/acuario.png", periodo: "20 Ene - 18 Feb" },
            { nombre: "Piscis", imagen: "resources/signos_zodiaco/piscis.png", periodo: "19 Feb - 20 Mar" }
        ];
    
        // Creamos las filas con los signos en una tabla 3x4
        let fila;
        for (let i = 0; i < signosZodiaco.length; i++) {
            if (i % 3 === 0) {
                fila = document.createElement("tr");
                tabla.appendChild(fila);
            }
    
            let celda = document.createElement("td");
            let div = document.createElement("div");
    
            // Imagen
            let imagen = document.createElement("img");
            imagen.src = signosZodiaco[i].imagen;
            imagen.alt = signosZodiaco[i].nombre;
            imagen.style.width = "60%";
            imagen.style.height = "auto";
    
            // Nombre del signo
            let nombre = document.createElement("h3");
            nombre.innerHTML = signosZodiaco[i].nombre;
    
            // Periodo del signo
            let periodo = document.createElement("p");
            periodo.innerHTML = signosZodiaco[i].periodo;
    
            // Añadimos imagen, nombre y periodo al div
            div.appendChild(imagen);
            div.appendChild(nombre);
            div.appendChild(periodo);
    
            // Añadimos el div a la celda
            celda.appendChild(div);
    
            // Añadimos la celda a la fila
            fila.appendChild(celda);
        }
    
        // Añadimos la tabla al contenedor
        document.getElementById(contenedor).appendChild(tabla);
    }

    // Función para mostrar la información del signo del usuario
    function crearInformacionSigno(contenedor, signoOccidentalUsuario) {
        let infoSigno = signosOccidentales[signoOccidentalUsuario];

        crearImagen(contenedor, "", "imgInfo", "resources/signos_zodiaco/" + signoOccidentalUsuario.toLowerCase() + ".png")
    
        // Crear título con el nombre del signo
        crearTitulo(contenedor, "", "hInfo", "h3", signoOccidentalUsuario);
    
        // Crear párrafo con el periodo del signo
        crearP(contenedor, "", "pPeriodoInfo", `Periodo: ${infoSigno.periodo}`);
    
        // Dividir la descripción por saltos de línea (\n) y crear un <p> por cada parte
        let lineasDescripcion = infoSigno.descripcion.split("\n");
        lineasDescripcion.forEach((linea, index) => {
            if (linea.trim() !== "") { // Evita agregar párrafos vacíos
            crearP(contenedor, "", "pDescripcionInfo", linea);
            }
        });
    }

    //Función para crear la tabla de los signos del horóscopo chino con sus imágenes
    function crearTablaHoroscopoChino(contenedor) {
        let tabla = document.createElement("table");

        let signosZodiaco = [
            { nombre: "Rata", imagen: "resources/signos_chino/rata.png"},
            { nombre: "Buey", imagen: "resources/signos_chino/buey.png"},
            { nombre: "Tigre", imagen: "resources/signos_chino/tigre.png"},
            { nombre: "Conejo", imagen: "resources/signos_chino/conejo.png"},
            { nombre: "Dragón", imagen: "resources/signos_chino/dragon.png"},
            { nombre: "Serpiente", imagen: "resources/signos_chino/serpiente.png"},
            { nombre: "Caballo", imagen: "resources/signos_chino/caballo.png"},
            { nombre: "Cabra", imagen: "resources/signos_chino/cabra.png"},
            { nombre: "Mono", imagen: "resources/signos_chino/mono.png"},
            { nombre: "Gallo", imagen: "resources/signos_chino/gallo.png"},
            { nombre: "Perro", imagen: "resources/signos_chino/perro.png"},
            { nombre: "Cerdo", imagen: "resources/signos_chino/cerdo.png"}
        ];
    
        // Creamos las filas con los signos en una tabla 3x4
        let fila;
        for (let i = 0; i < signosZodiaco.length; i++) {
            if (i % 3 === 0) {
                fila = document.createElement("tr");
                tabla.appendChild(fila);
            }
    
            let celda = document.createElement("td");
            let div = document.createElement("div");
    
            // Imagen
            let imagen = document.createElement("img");
            imagen.src = signosZodiaco[i].imagen;
            imagen.alt = signosZodiaco[i].nombre;
            imagen.style.width = "60%";
            imagen.style.height = "auto";
    
            // Nombre del signo
            let nombre = document.createElement("h3");
            nombre.innerHTML = signosZodiaco[i].nombre;
    
    
            // Añadimos imagen y nombre
            div.appendChild(imagen);
            div.appendChild(nombre);
    
            // Añadimos el div a la celda
            celda.appendChild(div);
    
            // Añadimos la celda a la fila
            fila.appendChild(celda);
        }
    
        // Añadimos la tabla al contenedor
        document.getElementById(contenedor).appendChild(tabla);
    }

    // Función para mostrar la información del horóscopo chino
    function crearInformacionHoroscopo(contenedor, signoOrientalUsuario) {
        let infoSigno = signosOrientales[signoOrientalUsuario];

        crearImagen(contenedor, "", "imgInfo", "resources/signos_chino/" + signoOrientalUsuario.toLowerCase() + ".png")
    
        // Crear título con el nombre del signo
        crearTitulo(contenedor, "", "hInfo", "h3", signoOrientalUsuario);
    
        // Crear párrafo con el periodo del signo
        crearP(contenedor, "", "pPeriodoInfo", `Periodo: ${infoSigno.periodo}`);
    
        // Dividir la descripción por saltos de línea (\n) y crear un <p> por cada parte
        let lineasDescripcion = infoSigno.descripcion.split("\n");
        lineasDescripcion.forEach((linea, index) => {
            if (linea.trim() !== "") { // Evita agregar párrafos vacíos
            crearP(contenedor, "", "pDescripcionInfo", linea);
            }
        });
    }
});