<?php
    include("conexion.php");

    $id = $_POST['id_producto'];
    $precio = $_POST['precio'];
    $cantidad = $_POST['cantidad'];

    $sql = "UPDATE productos SET precio=$precio, cantidad=$cantidad WHERE id_producto=$id";

    if ($conexion->query($sql)) {
        header("Location: tareaPHP_conexion_mySQL.php");
    } else {
        echo "Error: " . $conexion->error;
    }
?>
