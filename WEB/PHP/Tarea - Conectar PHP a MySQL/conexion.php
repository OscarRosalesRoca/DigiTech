<?php
$conexion = new mysqli("localhost", "root", "", "php_mySQL_categoria_productos");

if ($conexion->connect_error) {
    die("Error de conexión: " . $conexion->connect_error);
}
?>