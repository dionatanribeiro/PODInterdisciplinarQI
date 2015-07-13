package br.edu.qi.euroschool.mb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.DualListModel;

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
	
	@EJB(beanName = "AlunoBean")
	GenericBean<Aluno> alunoBean;
	
	private int capacidade;
	private String tema;
	public Professor professor;
	private Curso curso;
	private Date dataInicio;
	private Date dataFim;
	
	
	@Override
	public void validaCampos() {
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
	
	public Date getDataInicio() {
		return dataInicio;
	}
	
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public Date getDataFim() {
		return dataFim;
	}
	
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public List<Turma> getListTurma() {
		return bean.selectAll();
	}
	
	@Override
	public String salvar() {
		validaCampos();
		Turma turma = new Turma();
		turma.setProfessor(getProfessor());
		turma.setListaAluno(dlmAlunos.getTarget());
		turma.setCurso(getCurso());
		turma.setTema(tema);
		turma.setInicio(dataInicio);
		turma.setFim(dataFim);
		turma.setCapacidade(capacidade);
		bean.salvar(turma);
		return "home";
	}

	private DualListModel<Aluno> dlmAlunos;
	
	public DualListModel<Aluno> getDlmAlunos() {
		return dlmAlunos;
	}

	public void setDlmAlunos(DualListModel<Aluno> dualListModel) {
		this.dlmAlunos = dualListModel;
	}
	
	@PostConstruct
    public void init() {
		List<Aluno> alunosDisponiveis = alunoBean.selectAll();
		List<Aluno> alunosSelecionados = new ArrayList<Aluno>();
		setDlmAlunos(new DualListModel<Aluno>(alunosDisponiveis, alunosSelecionados));
	}

}
