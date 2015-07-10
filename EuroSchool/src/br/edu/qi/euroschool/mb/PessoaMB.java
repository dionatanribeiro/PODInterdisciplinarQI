package br.edu.qi.euroschool.mb;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.qi.euroschool.core.AbstractMB;
import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.model.Pessoa;
import br.edu.qi.euroschool.model.weak.Religiao;

@ManagedBean
@SessionScoped
public class PessoaMB extends AbstractMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB(beanName = "PessoaBean")
	GenericBean<Pessoa> bean;

	private String nome;
	private String logradouro;
	private int cep;
	private Religiao religiao;

	@Override
	public void validaCampos() {
		// TODO Auto-generated method stub

	}

	@Override
	public String salvar() {
		// TODO Auto-generated method stub
		validaCampos();	
		Pessoa pessoa = new Pessoa();
		pessoa.setCep(cep);
		pessoa.setLogradouro(logradouro);
		pessoa.setReligiao(religiao);
		bean.salvar(pessoa);
		return "home";
	}
	
	public List<Pessoa> getListPessoa() {
		return bean.selectAll();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Religiao getReligiao() {
		return religiao;
	}

	public void setReligiao(Religiao religiao) {
		this.religiao = religiao;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

}