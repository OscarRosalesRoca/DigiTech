drop database academia_idiomas;
create database if not exists academia_idiomas;

use academia_idiomas;

CREATE TABLE IF NOT EXISTS alumno (
	nombre CHAR(15),
	apellidos CHAR(25),
	dni_a INTEGER(5),
	direccion VARCHAR(60),
	fecha_de_nacimiento DATE,
	sexo ENUM('H', 'M'),
	codigo INTEGER(5),
	PRIMARY KEY(dni_a)
);

CREATE TABLE IF NOT EXISTS profesor (
	nombre CHAR(15),
	apellidos CHAR(25),
	dni_p INTEGER(5),
	direccion VARCHAR(60),
	titulo_academico ENUM('LDO', 'DDO', 'CFGS'),
	precio_hora DECIMAL(4,2) CHECK(precio_hora > 0),
	PRIMARY KEY(dni_p)
);

CREATE TABLE IF NOT EXISTS curso (
	nombre CHAR(15),
	codigo INTEGER(5),
	num_alum_reco INTEGER(5) CHECK(num_alum_reco >= 10),
	dni_p INTEGER(5),
	fecha_inicio DATE,
	fecha_final DATE CHECK(fecha_final > fecha_inicio),
	num_horas INTEGER(5) CHECK(num_horas >= 80),
	PRIMARY KEY (codigo)
);

ALTER TABLE alumno
	ADD CONSTRAINT FK_ALUMNO
	FOREIGN KEY (codigo)
	REFERENCES curso(codigo);