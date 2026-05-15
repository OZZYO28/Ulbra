CREATE TABLE Softwares
(
	Id INT NOT NULL PRIMARY KEY,
	Nome VARCHAR(30) NOT NULL,
	Tipo VARCHAR(30) NOT NULL
)

CREATE TABLE Disciplinas
(
	Id INT NOT NULL PRIMARY KEY,
	Disciplina VARCHAR(30) NOT NULL,
	Carga_Horaria INT NOT NULL,
	Utiliza INT REFERENCES Softwares(id)
)

CREATE TABLE Professores
(
	Id INT NOT NULL PRIMARY KEY,
	Nome VARCHAR(30) NOT NULL,
	Idade INT NOT NULL,
	Especializacao VARCHAR(30) NOT NULL,
	Leciona INT REFERENCES Disciplinas(Id)
)

INSERT INTO Softwares(Id, Nome, Tipo) VALUES ('01','Figma', 'Design')

INSERT INTO Disciplinas(Id, Disciplina, Carga_Horaria, Utiliza) VALUES ('01','UI/UX', '40', '01')

INSERT INTO Professores(Id, Nome, Idade, Especializacao, Leciona) VALUES ('01','Paulo', '25', 'Direito', '01')