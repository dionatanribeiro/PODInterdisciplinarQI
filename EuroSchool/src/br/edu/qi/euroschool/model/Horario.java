package br.edu.qi.euroschool.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import br.edu.qi.euroschool.core.WeakModel;
import br.edu.qi.euroschool.model.weak.Dia;

@Entity
public class Horario extends WeakModel implements Serializable{

	private static final long serialVersionUID = 659355606301514309L;

	@OneToOne(cascade=CascadeType.ALL) 
	@JoinTable(name="horario_turma", 
			   joinColumns={@JoinColumn(name="IdHorario", 
			   	referencedColumnName="id")}, 
			   inverseJoinColumns={@JoinColumn(name="IdTurma", 
			   	referencedColumnName="id")})
	@NotFound(action = NotFoundAction.IGNORE)
	private Turma turma;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "professorId", referencedColumnName = "ID", nullable = false, unique = true)
	public Dia dia;
	
	public Horario(String descricao) {
		super(descricao);
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Dia getDia() {
		return dia;
	}

	public void setDia(Dia dia) {
		this.dia = dia;
	}

}
