drop database pubs;
create database if not exists pubs;

use pubs;

CREATE TABLE IF NOT EXISTS pub (
	cod_pub CHAR (15) NOT NULL,
	nombre CHAR (15) NOT NULL,
	licencia_fiscal CHAR (15) NOT NULL,
	domicilio CHAR (15),
	fecha_apertura DATE NOT NULL,
	horario CHAR (15) NOT NULL CHECK (horario IN ('HOR1', 'HOR2', 'HOR3')),
	cod_localidad VARCHAR (15) NOT NULL ZEROFILL,
	PRIMARY KEY(cod_pub)
);

CREATE TABLE IF NOT EXISTS titular (
	dni_titular CHAR (15) NOT NULL,
	nombre CHAR (15) NOT NULL,
	domicilio_pub CHAR (15),
	cod_pub CHAR (15) NOT NULL,
	PRIMARY KEY(dni_titular)
);

CREATE TABLE IF NOT EXISTS empleado (
	dni_empleado CHAR (15) NOT NULL,
	nombre CHAR (15) NOT NULL,
	domicilio CHAR (15),
	PRIMARY KEY(dni_empleado)
);

CREATE TABLE IF NOT EXISTS existencias (
	cod_articulo CHAR (15) NOT NULL,
	nombre CHAR (15) NOT NULL,
	cantidad DECIMAL (5,2) NOT NULL,
	precio DECIMAL (5,2) NOT NULL CHECK (precio>0),
	PRIMARY KEY(cod_articulo)
);

ALTER TABLE existencias
	ADD cod_pub CHAR (15) AFTER precio;

CREATE TABLE IF NOT EXISTS localidad (
	cod_localidad CHAR (15) NOT NULL ZEROFILL,
	nombre CHAR (15) NOT NULL,
	PRIMARY KEY(cod_localidad)	
);

CREATE TABLE IF NOT EXISTS pub_empleado (
	cod_pub CHAR (15) NOT NULL,
	dni_empleado CHAR (15) NOT NULL,
	funcion ENUM ('camarero', 'seguridad', 'limpieza') NOT NULL,
	PRIMARY KEY(cod_pub, dni_empleado, funcion)
);

ALTER TABLE pub
	ADD CONSTRAINT FK_PUB_4
	FOREIGN KEY (cod_localidad)
	REFERENCES localidad(cod_localidad);

ALTER TABLE titular
	ADD CONSTRAINT FK_TITULAR_1
	FOREIGN KEY (cod_pub)
	REFERENCES pub(cod_pub);

ALTER TABLE existencias
	ADD CONSTRAINT FK_EXISTENCIAS_1
	FOREIGN KEY (cod_pub)
	REFERENCES pub(cod_pub);

ALTER TABLE pub_empleado
	ADD CONSTRAINT FK_PUB_EMPLEADO_1
	FOREIGN KEY (cod_pub)
	REFERENCES pub(cod_pub);

ALTER TABLE pub_empleado
	ADD CONSTRAINT FK_PUB_EMPLEADO_2
	FOREIGN KEY (dni_empleado)
	REFERENCES empleado(dni_empleado);