const jugar = confirm("¿Quieres jugar a un juego?");
if (jugar) {
    alert("BIEN");
    let pais = prompt("¿Qué país quieres? Francia - España - Portugal");
    pais = pais.toLowerCase();

    switch (pais) {
        case "francia":
            let ciudad = prompt("¿Qué ciudad quieres? París - Marsella - Lyon");
            ciudad = ciudad.toLowerCase();
            switch (ciudad) {
                case "parís":
                    var p = document.getElementById("primero");
                    p.innerHTML = "¡Bienvenido a París!";
                    document.getElementById("imagen1").src = "resources/paris1.jpg";
                    document.getElementById("imagen2").src = "resources/paris2.jpg";
                    document.getElementById("imagen3").src = "resources/paris3.jpg";
                break;
                case "marsella":
                    var p = document.getElementById("primero");
                    p.innerHTML = "¡Bienvenido a Marsella!";
                    document.getElementById("imagen1").src = "resources/marsella1.jpg";
                    document.getElementById("imagen2").src = "resources/marsella2.jpg";
                    document.getElementById("imagen3").src = "resources/marsella3.jpg";
                break;
                case "lyon":
                    var p = document.getElementById("primero");
                    p.innerHTML = "¡Bienvenido a Lyon!";
                    document.getElementById("imagen1").src = "resources/lyon1.jpg";
                    document.getElementById("imagen2").src = "resources/lyon2.jpg";
                    document.getElementById("imagen3").src = "resources/lyon3.jpg";
                break;
            }
        break;
    case "españa":
        let lugar = prompt("¿Playa o montaña?");
        lugar = lugar.toLowerCase();
        switch (lugar) {
            case "playa":
                var p = document.getElementById("primero");
                p.innerHTML = "¡Vamos a nadar!";
                document.getElementById("imagen1").src = "resources/playa1.jpg";
                document.getElementById("imagen2").src = "resources/playa2.jpg";
                document.getElementById("imagen3").src = "resources/playa3.jpg";
                break;
        
            case "montaña":
                var p = document.getElementById("primero");
                p.innerHTML = "¡A caminar!";
                document.getElementById("imagen1").src = "resources/montaña1.jpg";
                document.getElementById("imagen2").src = "resources/montaña2.jpg";
                document.getElementById("imagen3").src = "resources/montaña3.jpg";
                break;
        }
        break;
    case "portugal":
        let portugal = prompt("¿Qué quieres hacer? Turismo - Playa - Montaña")
        portugal = portugal.toLowerCase();
        switch (portugal) {
            case "turismo":
                var p = document.getElementById("primero");
                p.innerHTML = "¡A hacer turismo pues!";
                document.getElementById("imagen1").src = "resources/lisboa1.jpg";
                document.getElementById("imagen2").src = "resources/lisboa2.jpg";
                break;
        
            case "playa":
                var p = document.getElementById("primero");
                p.innerHTML = "¡Qué azul más bonito!";
                document.getElementById("imagen1").src = "resources/algarve1.jpg";
                document.getElementById("imagen2").src = "resources/algarve2.jpg";
                break;

            case "montaña":
                var p = document.getElementById("primero");
                p.innerHTML = "¡Algo más religioso pues!";
                document.getElementById("imagen1").src = "resources/nazaret1.jpg";
                document.getElementById("imagen2").src = "resources/santuarioFatima.jpg";
                break;
        }
        break;
    }
} else {
    alert("JOPETAS");
    document.getElementById("imagen1").src = "resources/aburrido.jpg";
}

