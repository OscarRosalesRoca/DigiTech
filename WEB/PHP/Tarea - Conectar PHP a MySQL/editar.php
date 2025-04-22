<?php
include("conexion.php");
$id = $_GET['id'];
$result = $conexion->query("SELECT * FROM productos WHERE id_producto=$id");
$producto = $result->fetch_assoc();
?>

<!DOCTYPE html>
<html>
<head>
    <title>Editar Producto</title>
</head>
<body>
    <h1>Editar Producto</h1>
    <form action="actualizar.php" method="post">
        <input type="hidden" name="id_producto" value="<?php echo $producto['id_producto']; ?>">
        Precio: <input type="number" name="precio" step="0.01" value="<?php echo $producto['precio']; ?>"><br>
        Cantidad: <input type="number" name="cantidad" value="<?php echo $producto['cantidad']; ?>"><br>
        <input type="submit" value="Actualizar">
    </form>
</body>
</html>
