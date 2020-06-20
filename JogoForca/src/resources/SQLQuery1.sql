CREATE DATABASE db_JogoForca

CREATE TABLE Pessoa(
	id int identity(1,1) primary key NOT NULL,
	nome char(20) NOT NULL,
	usuario char(20) NOT NULL,
	senha char(20) NOT NULL,
	idade int NULL,
	telefone char(20) NULL,
	city char(20) NULL,
	estado char(20) NULL,
	cartao char(16) NOT NULL,
	)

CREATE TABLE Usuario(
	pessoa_id int foreign key references Pessoa,
	usuario char(20) primary key NOT NULL,
	senha char(20) NOT NULL,
)

SELECT * FROM Pessoa 
SELECT * FROM Usuario

