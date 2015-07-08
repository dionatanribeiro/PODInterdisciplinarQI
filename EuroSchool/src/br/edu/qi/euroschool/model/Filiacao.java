package br.edu.qi.euroschool.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.edu.qi.euroschool.core.WeakModel;
import br.edu.qi.euroschool.model.weak.TipoFiliacao;

@Entity
public class Filiacao extends WeakModel implements Serializable {

	private static final long serialVersionUID = 5585849331795513627L;

	public Filiacao(String descricao) {
		super(descricao);
	}
	
	public Filiacao(String descricao, TipoFiliacao tipoFiliacao) {
		super(descricao);
		this.tipoFiliacao = tipoFiliacao;
	}
	
	public TipoFiliacao getTipoFiliacao() {
		return tipoFiliacao;
	}

	public void setTipoFiliacao(TipoFiliacao tipoFiliacao) {
		this.tipoFiliacao = tipoFiliacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdTipoFiliacao", referencedColumnName = "ID", nullable = false, unique = false)
	private TipoFiliacao tipoFiliacao;

}
