package br.edu.qi.euroschool.model.weak;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import br.edu.qi.euroschool.core.WeakModel;
import br.edu.qi.euroschool.model.Pessoa;

@Entity
public class Sexo extends WeakModel implements Serializable {

	private static final long serialVersionUID = -4526191311525527806L;

	@OneToMany(mappedBy = "religiao", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Pessoa> pessoa;
	
	public Sexo(String descricao) {
		super(descricao);
	}

	public Sexo(){
		super();
	}

	public List<Pessoa> getPessoa() {
		return pessoa;
	}

	public void setPessoa(List<Pessoa> pessoa) {
		this.pessoa = pessoa;
	}
	
}