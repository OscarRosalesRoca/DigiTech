drop database pedidos;
create database if not exists pedidos;

use pedidos;

CREATE TABLE IF NOT EXISTS pedido (
	RefPed CHAR(5),
	FecPed DATE,
	PRIMARY KEY(RefPed)
);

CREATE TABLE IF NOT EXISTS LineaPedido (
	RefPed CHAR(5),
	CodArt CHAR(5),
	CantArt INT(5),
	PRIMARY KEY(RefPed, CodArt)
);

CREATE TABLE IF NOT EXISTS articulo (
	CodArt CHAR(5),
	DesArt VARCHAR(30),
	PVPArt DECIMAL(3,2),
	PRIMARY KEY(CodArt)
);

ALTER TABLE LineaPedido
	ADD CONSTRAINT FK_lineaPedido_1
	FOREIGN KEY (RefPed)
	REFERENCES pedido(RefPed);

ALTER TABLE LineaPedido
	ADD CONSTRAINT FK_lineaPedido_2
	FOREIGN KEY (CodArt)
	REFERENCES articulo(CodArt);

INSERT INTO pedido VALUES
	('P0001', '2014-02-16'),
	('P0002', '2014-02-18'),
	('P0003', '2014-02-23'),
	('P0004', '2014-02-25');

UPDATE pedido
	SET FecPed='2014-02-25' 
	WHERE RefPed='P0004';	

INSERT INTO LineaPedido VALUES
	('P0001', 'A0043', 10),
	('P0001', 'A0078', 12),
	('P0002', 'A0043', 5),
	('P0003', 'A0075', 20),
	('P0004', 'A0012', 15),
	('P0004', 'A0043', 5),
	('P0004', 'A0089', 50);

INSERT INTO articulo VALUES
	('A0043', 'Bolígrafo azul fino', 0.78),
	('A0078', 'Bolígrafo rojo normal', 1.05),
	('A0075', 'Lápiz 2B', 0.55),
	('A0012', 'Goma de borrar', 0.15),
	('A0089', 'Sacapuntas', 0.25);

SELECT * FROM articulo WHERE PVPArt < 1;

UPDATE articulo
	SET PVPArt = PVPArt + 0.2 
	WHERE PVPArt < 1;

UPDATE pedido
	SET FecPed = '2024-02-28'  
	WHERE RefPed = 'P0001';

SELECT * FROM articulo WHERE PVPArt > 1;

DELETE FROM LineaPedido WHERE CodArt = 'A0078';

DELETE FROM articulo WHERE PVPArt > 1;

ALTER TABLE LineaPedido
	MODIFY COLUMN CantArt DECIMAL(4,2);

UPDATE LineaPedido
	SET CantArt = CantArt + 5 
	WHERE RefPed = 'P0004';

ALTER TABLE articulo
	MODIFY COLUMN PVPArt DECIMAL(3,2) CHECK (PVPArt > 0);  
