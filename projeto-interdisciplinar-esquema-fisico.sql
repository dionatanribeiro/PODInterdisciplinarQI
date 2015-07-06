CREATE DATABASE INTERDISCIPLINAR

CREATE TABLE Etnias (
Id_etnia Int PRIMARY KEY,
Descricao Varchar(15)
)

CREATE TABLE Tipo_filiacao (
Id_tipo Int PRIMARY KEY,
Descricao Varchar(15)
)

CREATE TABLE Religiao (
Id_religiao Int PRIMARY KEY,
Descricao Varchar(15)
)

CREATE TABLE Deficiencias (
Id_deficencia Int PRIMARY KEY,
Descricao Varchar(15),
Grau Int
)

CREATE TABLE Funcionarios (
Id_pessoa Int PRIMARY KEY,
Dt_admissao Datetime,
Cargo Varchar(15)
)

CREATE TABLE Alunos (
Id_pessoa Int PRIMARY KEY,
F_pagamento Varchar(15)
)

CREATE TABLE Dias (
Id_dia Int PRIMARY KEY,
Descricao Varchar(70)
)

CREATE TABLE Horarios (
Id_horario Int PRIMARY KEY,
Id_dia Int,
Descricao Varchar(15),
FOREIGN KEY(Id_dia) REFERENCES Dias (Id_dia)
)

CREATE TABLE Professores (
Id_pessoa Int PRIMARY KEY,
Formacao Varchar(15)
)

CREATE TABLE Usuarios (
Login Varchar(15) PRIMARY KEY,
Senha Varchar(15),
Id_pessoa Int
)

CREATE TABLE Item (
Id_item Int PRIMARY KEY,
Descricao Varchar(70),
Valor Float
)

CREATE TABLE Pessoas (
Id_pessoa Int PRIMARY KEY,
CEP Int,
Logradouro Varchar(70),
Nome_social Varchar(50),
Nome Varchar(50),
Id_etnia Int,
Id_religiao Int,
Id_sexo Int,
FOREIGN KEY(Id_etnia) REFERENCES Etnias (Id_etnia),
FOREIGN KEY(Id_religiao) REFERENCES Religiao (Id_religiao)
)

CREATE TABLE Vendas (
Id_venda Int PRIMARY KEY,
Id_pessoa Int,
Data Datetime,
Valor_total Float,
FOREIGN KEY(Id_pessoa) REFERENCES Pessoas (Id_pessoa)
)

CREATE TABLE Turmas (
Id_turma Int PRIMARY KEY,
Id_curso Int,
Capacidade Int,
Data_fim Datetime,
Data_inicio Datetime,
Tema Varchar(70)
)

CREATE TABLE Servicos (
Id_item Int PRIMARY KEY,
Especificacao Varchar(70),
Duracao Int,
FOREIGN KEY(Id_item) REFERENCES Item (Id_item)
)

CREATE TABLE Produtos (
Id_item Int PRIMARY KEY,
Quantidade Int,
Local Varchar(15),
FOREIGN KEY(Id_item) REFERENCES Item (Id_item)
)

CREATE TABLE Sexo (
Id_sexo Int PRIMARY KEY,
Descricao Varchar(15)
)

CREATE TABLE Filiacao (
Id_filiacao Int PRIMARY KEY,
Descricao Varchar(15),
Id_tipo Int,
Id_pessoa Int,
FOREIGN KEY(Id_tipo) REFERENCES Tipo_filiacao (Id_tipo),
FOREIGN KEY(Id_pessoa) REFERENCES Pessoas (Id_pessoa)
)

CREATE TABLE Cursos (
Id_curso Int PRIMARY KEY,
Descricao Varchar(15)
)

CREATE TABLE Telefones (
Id_telefone Int PRIMARY KEY,
Telefones Varchar(15),
Id_pessoa Int,
FOREIGN KEY(Id_pessoa) REFERENCES Pessoas (Id_pessoa)
)

CREATE TABLE Item_venda (
Id_item Int,
Id_venda Int,
Quantidade Int,
Valor_unitario float,
PRIMARY KEY(Id_item,Id_venda),
FOREIGN KEY(Id_item) REFERENCES Item (Id_item),
FOREIGN KEY(Id_venda) REFERENCES Vendas (Id_venda)
)

CREATE TABLE Horario_Turmas (
Id_horario Int,
Id_turma Int,
PRIMARY KEY(Id_horario,Id_turma),
FOREIGN KEY(Id_horario) REFERENCES Horarios (Id_horario),
FOREIGN KEY(Id_turma) REFERENCES Turmas (Id_turma)
)

CREATE TABLE Matricula (
Id_turma Int,
Id_pessoa Int,
PRIMARY KEY(Id_turma,Id_pessoa),
FOREIGN KEY(Id_turma) REFERENCES Turmas (Id_turma),
FOREIGN KEY(Id_pessoa) REFERENCES Alunos (Id_pessoa)
)

CREATE TABLE Horario_Pessoas (
Id_pessoa Int,
Id_horario Int,
Ano Int,
Situacao Varchar(15),
PRIMARY KEY(Id_pessoa,Id_horario),
FOREIGN KEY(Id_pessoa) REFERENCES Pessoas (Id_pessoa),
FOREIGN KEY(Id_horario) REFERENCES Horarios (Id_horario)
)

CREATE TABLE Defic_Pessoas (
Id_pessoa Int,
Id_deficencia Int,
FOREIGN KEY(Id_pessoa) REFERENCES Pessoas (Id_pessoa),
FOREIGN KEY(Id_deficencia) REFERENCES Deficiencias (Id_deficencia)
)

CREATE TABLE Prod_Turmas (
Id_turma Int,
Id_item Int,
PRIMARY KEY(Id_turma,Id_item),
FOREIGN KEY(Id_turma) REFERENCES Turmas (Id_turma),
FOREIGN KEY(Id_item) REFERENCES Produtos (Id_item)
)

ALTER TABLE Funcionarios ADD FOREIGN KEY(Id_pessoa) REFERENCES Pessoas (Id_pessoa)
ALTER TABLE Alunos ADD FOREIGN KEY(Id_pessoa) REFERENCES Pessoas (Id_pessoa)
ALTER TABLE Professores ADD FOREIGN KEY(Id_pessoa) REFERENCES Pessoas (Id_pessoa)
ALTER TABLE Usuarios ADD FOREIGN KEY(Id_pessoa) REFERENCES Pessoas (Id_pessoa)
ALTER TABLE Pessoas ADD FOREIGN KEY(Id_sexo) REFERENCES Sexo (Id_sexo)
ALTER TABLE Turmas ADD FOREIGN KEY(Id_curso) REFERENCES Cursos (Id_curso)
