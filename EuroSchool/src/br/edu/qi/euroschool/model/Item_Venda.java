package br.edu.qi.euroschool.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import br.edu.qi.euroschool.core.AbstractEntity;

@Entity
public class Item_Venda extends AbstractEntity implements Serializable{

	private static final long serialVersionUID = -7324176367593515586L;
	
	private Integer quantidade;
	private Double valorUnitario;
	
	@ManyToOne
	@JoinColumn(name = "idItem", referencedColumnName = "ID", nullable = false)
	@NotFound(action = NotFoundAction.IGNORE)
	private Item item;
	
	@ManyToOne
	@JoinColumn(name = "idVenda", referencedColumnName = "ID", nullable = false)
	private Venda venda;

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

}
