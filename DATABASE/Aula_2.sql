CREATE TABLE clientes
(
	cpf int not null primary key,
	nome varchar(30) not null,
	limite_saldo int not null
)

ALTER TABLE clientes
add column idade int

ALTER TABLE clientes
rename column limite_saldo TO credito

ALTER TABLE clientes
alter column credito type varchar(10)

ALTER TABLE clientes
drop column credito

DROP TABLE clientes

SELECT * FROM clientes