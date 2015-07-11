package br.edu.qi.euroschool.model.weak;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import br.edu.qi.euroschool.core.WeakModel;
import br.edu.qi.euroschool.model.Turma;

@Entity
public class Curso extends WeakModel implements Serializable {

	private static final long serialVersionUID = 9131807816782780366L;

	@OneToMany(mappedBy = "curso", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Turma> turmas;

	public Curso(String descricao) {
		super(descricao);
	}

	public Curso() {
		super();
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

}