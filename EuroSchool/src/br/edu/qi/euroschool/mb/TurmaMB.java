package br.edu.qi.euroschool.mb;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.core.WeakMB;
import br.edu.qi.euroschool.model.Turma;
import br.edu.qi.euroschool.model.pessoas.Aluno;
import br.edu.qi.euroschool.model.pessoas.Professor;
import br.edu.qi.euroschool.model.weak.Curso;

@ManagedBean
@ViewScoped
public class TurmaMB extends WeakMB implements Serializable{

	private static final long serialVersionUID = 4224321469359297635L;

	@EJB(beanName = "TurmaBean")
	GenericBean<Turma> bean;
	
	private List<Aluno> alunosDaTurma;
	private int capacidade;
	private String tema;
	public Professor professor;
	private Curso curso;
	
	@Override
	public void validaCampos() {
		if (getDescricao().isEmpty()) {
			
		}
	}
	
	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<Turma> getListTurma() {
		return bean.selectAll();
	}
	
	@Override
	public String salvar() {
		validaCampos();
		bean.salvar(new Turma());
		return "home";
	}

	public List<Aluno> getAlunosDaTurma() {
		return alunosDaTurma;
	}

	public void setAlunosDaTurma(List<Aluno> alunosDaTurma) {
		this.alunosDaTurma = alunosDaTurma;
	}

}
