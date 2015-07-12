package br.edu.qi.euroschool.model.weak;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import br.edu.qi.euroschool.core.WeakModel;
import br.edu.qi.euroschool.model.Horario;

@Entity
public class Dia extends WeakModel implements Serializable {

	private static final long serialVersionUID = 7553189164134422925L;

	@OneToMany(mappedBy = "dia", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Horario> horario;
	
	public Dia(String descricao) {
		super(descricao);
	}

	public Dia(){
		super();
	}

	public List<Horario> getHorario() {
		return horario;
	}

	public void setHorario(List<Horario> horario) {
		this.horario = horario;
	}
	
}