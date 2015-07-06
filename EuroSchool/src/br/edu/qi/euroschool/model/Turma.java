package br.edu.qi.euroschool.model;

import java.io.Serializable;

import javax.persistence.Entity;

import org.eclipse.persistence.jpa.jpql.parser.DateTime;

import br.edu.qi.euroschool.core.AbstractEntity;

@Entity
public class Turma extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1253115040832120058L;
	private int capacidade;
	private DateTime inicio;
	private DateTime fim;
	private String tema;

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public DateTime getInicio() {
		return inicio;
	}

	public void setInicio(DateTime inicio) {
		this.inicio = inicio;
	}

	public DateTime getFim() {
		return fim;
	}

	public void setFim(DateTime fim) {
		this.fim = fim;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

}
