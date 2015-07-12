package br.edu.qi.euroschool.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.edu.qi.euroschool.core.AbstractEntity;
import br.edu.qi.euroschool.model.itens.Produto;
import br.edu.qi.euroschool.model.pessoas.Aluno;
import br.edu.qi.euroschool.model.pessoas.Professor;
import br.edu.qi.euroschool.model.weak.Curso;

@Entity
public class Turma extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1253115040832120058L;

	private int capacidade;

	@Column(columnDefinition = "DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date inicio;

	@Column(columnDefinition = "DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fim;

	private String tema;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cursoId", referencedColumnName = "ID", nullable = false, unique = true)
	private Curso curso;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "professorId", referencedColumnName = "ID", nullable = false, unique = true)
	public Professor professor;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "produto_turma", 
		joinColumns = { @JoinColumn(name = "IdTurma", 
			referencedColumnName = "id") }, 
		inverseJoinColumns = { @JoinColumn(name = "IdProduto", 
			referencedColumnName = "id") })
	private List<Produto> listaProduto;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "horario_turma", 
		joinColumns = { @JoinColumn(name = "IdTurma", 
			referencedColumnName = "id") }, 
		inverseJoinColumns = { @JoinColumn(name = "IdHorario", 
			referencedColumnName = "id") })
	private List<Horario> listaHorario;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "aluno_turma", 
		joinColumns = { @JoinColumn(name = "IdTurma", 
			referencedColumnName = "id") }, 
		inverseJoinColumns = { @JoinColumn(name = "IdAluno", 
			referencedColumnName = "id") })
	private List<Aluno> listaAluno;
	
	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<Produto> getListaProduto() {
		return listaProduto;
	}

	public void setListaProduto(List<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}

	public List<Horario> getListaHorario() {
		return listaHorario;
	}

	public void setListaHorario(List<Horario> listaHorario) {
		this.listaHorario = listaHorario;
	}

	public List<Aluno> getListaAluno() {
		return listaAluno;
	}

	public void setListaAluno(List<Aluno> listaAluno) {
		this.listaAluno = listaAluno;
	}

}
