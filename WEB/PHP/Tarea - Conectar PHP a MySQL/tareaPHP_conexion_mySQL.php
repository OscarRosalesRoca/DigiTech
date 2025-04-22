<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Control de la base de datos categorias y productos</title>
    <link rel="stylesheet" href="php_conection.css">
</head>
<body>
<h1>Productos</h1>
    <a href="agregar.php">➕ Agregar producto</a>
    <table border="1">
        <tr>
            <th>Nombre</th>
            <th>Descripción</th>
            <th>Precio</th>
            <th>Cantidad</th>
            <th>Categoría</th>
            <th>Acciones</th>
        </tr>

        <?php
        include("conexion.php");
        $sql = "SELECT p.*, c.nombre AS categoria FROM productos p
                JOIN categorias c ON p.id_categoria = c.id_categoria";
        $resultado = $conexion->query($sql);

        while ($fila = $resultado->fetch_assoc()) {
            echo "<tr>
                    <td>{$fila['nombre']}</td>
                    <td>{$fila['descripcion']}</td>
                    <td>{$fila['precio']}</td>
                    <td>{$fila['cantidad']}</td>
                    <td>{$fila['categoria']}</td>
                    <td>
                        <a href='editar.php?id={$fila['id_producto']}'>✏️ Editar</a> |
                        <a href='eliminar.php?id={$fila['id_producto']}' onclick=\"return confirm('¿Seguro que deseas eliminar este producto?')\">🗑️ Eliminar</a>
                    </td>
                </tr>";
        }
        ?>
    </table>
</body>
</html>