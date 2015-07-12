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
public class Religiao extends WeakModel implements Serializable {

	private static final long serialVersionUID = 3646794606752930191L;

	@OneToMany(mappedBy = "religiao", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Pessoa> pessoa;

	public Religiao(String descricao) {
		super(descricao);
	}

	public Religiao() {
		super();
	}

	public List<Pessoa> getPessoa() {
		return pessoa;
	}

	public void setPessoa(List<Pessoa> pessoa) {
		this.pessoa = pessoa;
	}

}
