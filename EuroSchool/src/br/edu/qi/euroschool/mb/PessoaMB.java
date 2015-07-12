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
import br.edu.qi.euroschool.model.Filiacao;
import br.edu.qi.euroschool.model.Pessoa;
import br.edu.qi.euroschool.model.weak.Deficiencia;
import br.edu.qi.euroschool.model.weak.Etnia;
import br.edu.qi.euroschool.model.weak.Religiao;
import br.edu.qi.euroschool.model.weak.Sexo;
import br.edu.qi.euroschool.util.MBUtils;

@ManagedBean
@SessionScoped
public class PessoaMB extends AbstractMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB(beanName = "PessoaBean")
	GenericBean<Pessoa> bean;

	private Long id;
	private String nome;
	private String logradouro;
	private String cep;
	private String telefone;

	private Religiao religiao;
	private List<Deficiencia> deficienciasEscolhidas;
	private Sexo sexo;
	private Etnia etnia;
	private Filiacao filiacao;
	
	@Override
	public void validaCampos() {
		// TODO Auto-generated method stub

	}

	@Override
	public String salvar() {
		validaCampos();	
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setCep(Integer.parseInt(cep.replace("-", "")));
		pessoa.setTelefone(MBUtils.formatTelephone(telefone));
		pessoa.setLogradouro(logradouro);
		pessoa.setReligiao(religiao);
		pessoa.setListaDeficiencia(deficienciasEscolhidas);
		pessoa.setSexo(sexo);
		pessoa.setEtnia(etnia);
		pessoa.setFiliacao(filiacao);
		
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public List<Deficiencia> getDeficienciasEscolhidas() {
		return deficienciasEscolhidas;
	}

	public void setDeficienciasEscolhidas(List<Deficiencia> deficienciasEscolhidas) {
		this.deficienciasEscolhidas = deficienciasEscolhidas;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Etnia getEtnia() {
		return etnia;
	}

	public void setEtnia(Etnia etnia) {
		this.etnia = etnia;
	}

	public Filiacao getFiliacao() {
		return filiacao;
	}

	public void setFiliacao(Filiacao filiacao) {
		this.filiacao = filiacao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}