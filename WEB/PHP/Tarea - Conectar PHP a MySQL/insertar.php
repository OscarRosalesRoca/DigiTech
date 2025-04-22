<?php
    include("conexion.php");

    $nombre = $_POST['nombre'];
    $descripcion = $_POST['descripcion'];
    $precio = $_POST['precio'];
    $cantidad = $_POST['cantidad'];
    $id_categoria = $_POST['id_categoria'];

    $sql = "INSERT INTO productos (nombre, descripcion, precio, cantidad, id_categoria)
            VALUES ('$nombre', '$descripcion', $precio, $cantidad, $id_categoria)";

    if ($conexion->query($sql)) {
        header("Location: tareaPHP_conexion_mySQL.php");
    } else {
        echo "Error: " . $conexion->error;
    }
?>
