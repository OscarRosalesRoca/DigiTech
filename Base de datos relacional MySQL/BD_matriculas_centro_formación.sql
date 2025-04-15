drop database matriculas;
create database if not exists matriculas;

use matriculas;

CREATE TABLE IF NOT EXISTS alumnos (
	num_matricula INTEGER(5),
	nombre VARCHAR(60),
	fecha_nacimiento DATE,
	telefono CHAR(12),
	PRIMARY KEY(num_matricula)
);

CREATE TABLE IF NOT EXISTS recibe (
	num_matricula INTEGER(5),
	cod_asignatura INTEGER(5),
	curso_escolar CHAR(5),
	PRIMARY KEY(num_matricula, cod_asignatura, curso_escolar)	
);

CREATE TABLE IF NOT EXISTS asignaturas (
	cod_asignatura INTEGER(5),
	nombre VARCHAR(30),
	id_profesor INT(5),
	PRIMARY KEY(cod_asignatura)
);

CREATE TABLE IF NOT EXISTS profesores (
	id_profesor INTEGER(5),
	nif_p CHAR (10) UNIQUE,
	nombre VARCHAR(60),
	fecha_nacimiento DATE,
	telefono CHAR(12),
	PRIMARY KEY(id_profesor)
);

ALTER TABLE recibe
	ADD FOREIGN KEY (num_matricula)
	REFERENCES alumnos (num_matricula);

ALTER TABLE recibe
	MODIFY num_matricula INT(10) UNSIGNED NOT NULL;

ALTER TABLE alumnos
	MODIFY num_matricula INT(10) UNSIGNED NOT NULL;

ALTER TABLE recibe
	ADD CONSTRAINT FK_ASIGNATURAS
	FOREIGN KEY (cod_asignatura)
	REFERENCES asignaturas(cod_asignatura);

ALTER TABLE asignaturas
	ADD CONSTRAINT FK_PROFESOR
	FOREIGN KEY (id_profesor)
	REFERENCES profesores(id_profesor);
