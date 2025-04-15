drop database proveedores;
create database if not exists proveedores;

use proveedores;

CREATE TABLE IF NOT EXISTS proveedor (
	nombre_proveedor CHAR(15),
	direccion VARCHAR(60),
	ciudad CHAR(15),
	provinvia CHAR(15),
	PRIMARY KEY(nombre_proveedor, direccion)
);

CREATE TABLE IF NOT EXISTS suministra (
	nombre_proveedor CHAR(15),
	direccion VARCHAR(60),
	cod_pieza INTEGER(5),
	cantidad INTEGER(5)
);

CREATE TABLE IF NOT EXISTS pieza (
	cod_pieza INTEGER(5),
	nombre_pieza VARCHAR(40),
	precio INTEGER(5),
	nombre_categoria CHAR(20),
	PRIMARY KEY(cod_pieza)
);

CREATE TABLE IF NOT EXISTS categoria (
	nombre_categoria CHAR(20),
	PRIMARY KEY(nombre_categoria)
);

ALTER TABLE suministra ADD PRIMARY KEY(nombre_proveedor, direccion, cod_pieza);

ALTER TABLE pieza
	ADD CONSTRAINT FK_PIEZA
	FOREIGN KEY (nombre_categoria)
	REFERENCES categoria(nombre_categoria);

ALTER TABLE suministra
	ADD CONSTRAINT FK1_SUMINISTRA
	FOREIGN KEY (nombre_proveedor)
	REFERENCES proveedor(nombre_proveedor);

ALTER TABLE suministra
	ADD CONSTRAINT FK2_SUMINISTRA
	FOREIGN KEY (direccion)
	REFERENCES proveedor(direccion);

ALTER TABLE suministra
	ADD CONSTRAINT FK3_SUMINISTRA
	FOREIGN KEY (cod_pieza)
	REFERENCES pieza(cod_pieza);
