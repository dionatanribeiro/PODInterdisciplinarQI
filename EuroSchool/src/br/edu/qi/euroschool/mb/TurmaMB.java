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

import br.edu.qi.euroschool.beans.TurmaBean;
import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.core.WeakMB;
import br.edu.qi.euroschool.model.Pessoa;
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
	private Date dataInicioFiltro;
	private Date dataFimFiltro;
	
	
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
	
	public List<Turma> getListTurmaByFiltro() {
		return ((TurmaBean) bean).selectByPeriodo(getDataInicioFiltro(), getDataFimFiltro());
	}
	
	public List<Turma> getListTurmaTeste() {
		List <Turma> lista = new ArrayList<Turma>();
		List <Aluno> listaAluno = new ArrayList<Aluno>();
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Pedro");
		Pessoa p2 = new Pessoa();
		p2.setNome("Maria");
		Pessoa p3 = new Pessoa();
		p3.setNome("João");
		Professor professor = new Professor("Doutor", p3); 
		
		Aluno a1=new Aluno("Dinheiro",p1);
		Aluno a2=new Aluno("Dinheiro",p2);
		listaAluno.add(a1);
		listaAluno.add(a2);
		
		Turma t1 = new Turma();
		t1.setProfessor(professor);
		t1.setCapacidade(5);
		t1.setTema("POD");
		t1.setCurso(new Curso("ADS"));
		t1.setListaAluno(listaAluno);	
		
		lista.add(t1);
		lista.add(t1);
		return lista;
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
	
	public Date getDataInicioFiltro() {
		return dataInicioFiltro;
	}

	public void setDataInicioFiltro(Date dataInicioFiltro) {
		this.dataInicioFiltro = dataInicioFiltro;
	}

	public Date getDataFimFiltro() {
		return dataFimFiltro;
	}

	public void setDataFimFiltro(Date dataFimFiltro) {
		this.dataFimFiltro = dataFimFiltro;
	}

}
