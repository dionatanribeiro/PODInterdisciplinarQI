package br.edu.qi.euroschool.mb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.qi.euroschool.core.AbstractMB;
import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.dto.WeakDto;
import br.edu.qi.euroschool.model.Pessoa;
import br.edu.qi.euroschool.model.weak.Deficiencia;
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
	private Deficiencia deficiencia;
	private Long id;

	@Override
	public void validaCampos() {
		// TODO Auto-generated method stub

	}

	@Override
	public String salvar() {
		// TODO Auto-generated method stub
		validaCampos();	
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setCep(cep);
		pessoa.setLogradouro(logradouro);
		pessoa.setReligiao(religiao);
		bean.salvar(pessoa);
		return "home";
	}
	
	public List<Pessoa> getListPessoa() {
		return bean.selectAll();
	}
	
	public List<WeakDto> getComboList() {
		List<WeakDto> listDto = new ArrayList<WeakDto>();
		for (Pessoa p:bean.selectAll()){
			listDto.add(p.toDto());
		}
		return listDto;
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

	public Deficiencia getDeficiencia() {
		return deficiencia;
	}

	public void setDeficiencia(Deficiencia deficiencia) {
		this.deficiencia = deficiencia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}