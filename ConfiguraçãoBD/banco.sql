create database questaoum;
use questaoum;

create table livro(codigo int(10), titulo varchar(30), preco float, ano int, paginas int, imagem varchar(20), `status` varchar(1));

create table assunto(codigo int(10), descricao varchar(30));

create table autor(codigo int(10), nome varchar(30));

select * from livro;
select * from autor;
select * from assunto;

truncate table autor;
truncate table livro;
truncate table assunto;