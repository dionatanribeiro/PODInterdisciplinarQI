package br.edu.qi.euroschool.model.weak;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import br.edu.qi.euroschool.core.WeakModel;
import br.edu.qi.euroschool.model.Pessoa;

@Entity
public class Deficiencia extends WeakModel implements Serializable {

	private static final long serialVersionUID = -7551592004440598504L;

	private String grau;

	@ManyToMany(mappedBy="listaDeficiencia")
    private List<Pessoa> pessoas;
	
	public Deficiencia(String descricao) {
		super(descricao);
	}
	
	public Deficiencia() {
		super();
	}

	public String getGrau() {
		return grau;
	}

	public void setGrau(String grau) {
		this.grau = grau;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
}