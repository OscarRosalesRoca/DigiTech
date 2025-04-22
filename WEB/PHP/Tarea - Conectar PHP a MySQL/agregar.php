<?php include("conexion.php"); ?>

<!DOCTYPE html>
<html>
<head>
    <title>Agregar Producto</title>
</head>
<body>
    <h1>Nuevo Producto</h1>
    <form action="insertar.php" method="post">
        Nombre: <input type="text" name="nombre" required><br>
        Descripción: <textarea name="descripcion"></textarea><br>
        Precio: <input type="number" step="0.01" name="precio" required><br>
        Cantidad: <input type="number" name="cantidad" required><br>
        Categoría:
        <select name="id_categoria" required>
            <?php
            $cats = $conexion->query("SELECT * FROM categorias");
            while ($cat = $cats->fetch_assoc()) {
                echo "<option value='{$cat['id_categoria']}'>{$cat['nombre']}</option>";
            }
            ?>
        </select><br><br>
        <input type="submit" value="Agregar">
    </form>
</body>
</html>
