<?php
$calificacion = '';
if (isset($_POST['nota'])) {
    $nota = $_POST['nota'];

    if ($nota >= 0 && $nota <= 100) {
        if ($nota >= 90) {
            $calificacion = "A";
        } elseif ($nota >= 70) {
            $calificacion = "B";
        } elseif ($nota >= 50) {
            $calificacion = "C";
        } elseif ($nota >= 30) {
            $calificacion = "D";
        } elseif ($nota >= 0) {
            $calificacion = "F";
        } else {
            echo "Por favor, ingresa una nota válida entre 0 y 100.";
        }
    }
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Comprobar nota</title>
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
        <label for="nota">Introduce tu nota del 0 al 100:</label>
        <input type="number" name="nota" id="nota" min="0" max="100" required><br>
        <div>
            <button type="submit">Comprobar nota</button>
            <button type="reset">Borrar</button>
        </div>
    </form>

    <?php
    if ($calificacion == '') {

    } else {
        echo "Tu calificación es: " . $calificacion;
    }
    ?>
</body>
</html>