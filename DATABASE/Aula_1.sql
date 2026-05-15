create table alunos
(
	id int not null primary key,
	nome varchar(30) not null
)

create table departamentos
(
	id int not null primary key,
	nome varchar(30) not null
)

create table curso 
(
	id int not null primary key,
	nome varchar(30) not null,
	id_depto int references departamentos(id)
)

create table professores
(
	id int not null primary key,
	nome varchar(30) not null
)

create table disciplinas
(
	id int not null primary key,
	nome varchar(30) not null,
	id_prof  int references professores(id)
)

create table matriculas
(
	id_disciplina int references disciplinas(id),
	id_aluno int references aluno(id),
	data_matr date not null
)