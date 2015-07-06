package br.edu.qi.euroschool.model;

import java.io.Serializable;

import javax.persistence.Entity;

import org.eclipse.persistence.jpa.jpql.parser.DateTime;

import br.edu.qi.euroschool.core.AbstractEntity;

@Entity
public class Venda extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 8591680186760210L;
	
	private DateTime data;
	private double valorTotal;

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public DateTime getData() {
		return data;
	}

	public void setData(DateTime data) {
		this.data = data;
	}
}
