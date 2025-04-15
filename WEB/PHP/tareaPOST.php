<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $nombre = $_POST["nombre"];
    $apellido = $_POST["apellidos"];
    $destino = $_POST["destino"];  
    $remitente = $_POST["mail"];  
    $asunto = $_POST["asunto"];
    $mensaje = $_POST["mensaje"];
    
        // Encabezados del correo
        $cabeceras = "From: $remitente\r\n";
        $cabeceras .= "Reply-To: $remitente\r\n";
        $cabeceras .= "Content-Type: text/plain; charset=UTF-8\r\n";
    
        // Enviar el correo
        if (mail($destino, $asunto, $mensaje, $cabeceras)) {
            echo "Correo enviado con éxito.";
        } else {
            echo "Error al enviar el correo.";
        }
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Enviar a un mail</title>
    <style>
        label {
            display: block;
            margin-top: 10px;
        }
        div {
            margin-top: 15px;
        }
    </style>
</head>
<body>
    <form method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" id="nombre" required><br>

        <label for="apellidos">Apellidos:</label>
        <input type="text" name="apellidos" id="apellidos" required><br>

        <label for="destino">Mail destinatario:</label>
        <input type="text" name="destino" id="destino" required><br>

        <label for="mail">Mail remitente:</label>
        <input type="text" name="mail" id="mail" required><br>

        <label for="asunto">Asunto:</label>
        <input type="text" name="asunto" id="asunto" required><br>

        <label for="mensaje">Mensaje:</label>
        <textarea name="mensaje" id="mensaje" rows="5" cols="40" required></textarea><br>

        <div>
            <button type="submit">Enviar</button>
            <button type="reset">Borrar</button>
        </div>
    </form>
</body>
</html>