drop database euroschool;
create database euroschool;


INSERT INTO euroschool.tipofiliacao VALUES (1,'Pai');
INSERT INTO euroschool.tipofiliacao VALUES (2,'Mãe');
INSERT INTO euroschool.filiacao VALUES (1,'F-Pai',1);
INSERT INTO euroschool.filiacao VALUES (2,'F-Mãe',2);
INSERT INTO euroschool.religiao VALUES (1,'Ateu');
INSERT INTO euroschool.religiao VALUES (2,'Católico');
INSERT INTO euroschool.curso VALUES (1,'ADS');
INSERT INTO euroschool.curso VALUES (2,'Admistração');
INSERT INTO euroschool.deficiencia VALUES (1,'Def 1');
INSERT INTO euroschool.deficiencia VALUES (2,'Def 2');
INSERT INTO euroschool.sexo VALUES (1,'Homem');
INSERT INTO euroschool.sexo VALUES (2,'Mulher');
INSERT INTO euroschool.etnia VALUES (1,'Branco');
INSERT INTO euroschool.etnia VALUES (2,'Negro');


SELECT * FROM euroschool.tipofiliacao;
SELECT * FROM euroschool.filiacao;
SELECT * FROM euroschool.curso;
SELECT * FROM euroschool.aluno;
SELECT * FROM euroschool.deficiencia;
SELECT * FROM euroschool.pessoa;
SELECT * FROM euroschool.aluno;