<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $numero = $_POST["numero"];
    
    // Validar que el número sea un entero positivo
    if (!ctype_digit($numero) || (int)$numero <= 0) {
        echo "<p style='color: red;'>Por favor, ingrese un número entero positivo.</p>";
    } else {
        $numero = (int)$numero;
        echo "<h3>Tabla de multiplicación del $numero</h3>";
        echo "<ul>";
        for ($i = 1; $i <= 10; $i++) {
            $resultado = $numero * $i;
            if ($resultado % 5 == 0) {
                echo "<li><strong>$numero x $i = $resultado</strong> (Múltiplo de 5)</li>";
            } else {
                echo "<li>$numero x $i = $resultado</li>";
            }
        }
        echo "</ul>";
    }
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tabla de Multiplicación</title>
</head>
<body>
    <form method="post">
        <label for="numero">Ingrese un número entero positivo:</label>
        <input type="text" name="numero" id="numero" required>
        <button type="submit">Generar Tabla</button>
    </form>
</body>
</html>