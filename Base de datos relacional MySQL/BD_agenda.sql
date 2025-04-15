DROP DATABASE agenda_db;
CREATE DATABASE IF NOT EXISTS agenda_db;

USE agenda_db;

CREATE TABLE IF NOT EXISTS agenda (
	apellido CHAR (30),
	nombre CHAR (20),
	domicilio CHAR (30),
	telefono INT (9),
	prefijo CHAR (5) DEFAULT '+0034'
);

INSERT INTO agenda VALUES 
	('ALVAREZ','ALBERTO','COLON 123', '423456798', '+0034'),
	('JUAREZ','JUAN','AVELLANEDA 135', '445878778', '+0034'),
	('LOPEZ','MARIA','URQUIZA 333', '454545445', '+0047'),
	('LOPEZ','JOSE','URQUIZA 333', '423456798', '+0034'),
	('SALAS','SUSANA','GRAL. PAZ 1234', '412345612', '+0036');

UPDATE agenda
	SET nombre='JOSE'
	WHERE nombre='JUAN';

INSERT INTO agenda VALUES
	('ROSALES', 'OSCAR', 'ZARAGOZA 123', '123456789', '+0034');

UPDATE agenda
	SET apellido='GARCIA'
	WHERE apellido='LOPEZ';

UPDATE agenda
	SET nombre='ROBERTO'
	WHERE apellido='JOSE';

UPDATE agenda
	SET telefono='123456789'
	WHERE nombre='ALBERTO';

SELECT * FROM agenda WHERE telefono='423456789';

DELETE FROM agenda WHERE telefono='423456789';

DELETE FROM agenda;