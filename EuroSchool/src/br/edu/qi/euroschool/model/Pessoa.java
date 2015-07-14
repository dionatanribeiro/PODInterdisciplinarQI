package br.edu.qi.euroschool.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import br.edu.qi.euroschool.core.AbstractEntity;
import br.edu.qi.euroschool.dto.WeakDto;
import br.edu.qi.euroschool.model.weak.Deficiencia;
import br.edu.qi.euroschool.model.weak.Etnia;
import br.edu.qi.euroschool.model.weak.Religiao;
import br.edu.qi.euroschool.model.weak.Sexo;

@Entity
public class Pessoa extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = -5838891515904350993L;
	
	private String nome;
	private Integer cep;
	private String logradouro;
	private Long telefone;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdReligiao", referencedColumnName = "ID", nullable = false, unique = false)
	private Religiao religiao;

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "IdTelefone", referencedColumnName = "ID", nullable = false, unique = false)
//	private Telefone telefone;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdFiliacao", referencedColumnName = "ID", nullable = false, unique = false)
	private Filiacao filiacao;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "deficiencia_pessoa", 
		joinColumns = { @JoinColumn(name = "IdPessoa", 
			referencedColumnName = "id") }, 
		inverseJoinColumns = { @JoinColumn(name = "IdDeficiencia", 
			referencedColumnName = "id") })
	@NotFound(action = NotFoundAction.IGNORE)
	private List<Deficiencia> listaDeficiencia;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdSexo", referencedColumnName = "ID", nullable = false, unique = false)
	private Sexo sexo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdEtnia", referencedColumnName = "ID", nullable = false, unique = false)
	private Etnia etnia;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Religiao getReligiao() {
		return religiao;
	}

	public void setReligiao(Religiao religiao) {
		this.religiao = religiao;
	}

	public WeakDto toDto() {
		return new WeakDto(getId(), getNome());
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public Filiacao getFiliacao() {
		return filiacao;
	}

	public void setFiliacao(Filiacao filiacao) {
		this.filiacao = filiacao;
	}

	public List<Deficiencia> getListaDeficiencia() {
		return listaDeficiencia;
	}

	public void setListaDeficiencia(List<Deficiencia> listaDeficiencia) {
		this.listaDeficiencia = listaDeficiencia;
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
	
}
