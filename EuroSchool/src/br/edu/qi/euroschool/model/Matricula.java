package br.edu.qi.euroschool.model;

import javax.persistence.Entity;

import br.edu.qi.euroschool.model.pessoas.Aluno;

@Entity
public class Matricula {

	private Turma turma;
	private Aluno aluno;

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
}
