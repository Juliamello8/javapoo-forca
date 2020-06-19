CREATE DATABASE db_JogoForca

CREATE TABLE Pessoa(
	id int identity(1,1) primary key NOT NULL,
	nome char(20) NULL,
	usuario char(20) NULL,
	senha char(20) NULL,
	idade int NULL,
	telefone int NULL,
	city char(20) NULL,
	estado char(20) NULL,
	cartao int NULL,
	)

CREATE TABLE Usuario(
	pessoa_id int foreign key references Pessoa,
	usuario char(20) primary key,
	senha char(20) NULL,
)

SELECT * FROM Pessoa
SELECT * FROM Usuario
