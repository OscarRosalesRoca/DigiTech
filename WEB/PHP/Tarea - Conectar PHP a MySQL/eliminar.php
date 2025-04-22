<?php
    include("conexion.php");

    $id = $_GET['id'];

    $sql = "DELETE FROM productos WHERE id_producto=$id";

    if ($conexion->query($sql)) {
        header("Location: tareaPHP_conexion_mySQL.php");
    } else {
        echo "Error: " . $conexion->error;
    }
?>
