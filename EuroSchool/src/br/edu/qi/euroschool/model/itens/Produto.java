package br.edu.qi.euroschool.model.itens;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import br.edu.qi.euroschool.core.AbstractEntity;
import br.edu.qi.euroschool.model.Item;
import br.edu.qi.euroschool.model.Turma;

@Entity
public class Produto extends AbstractEntity implements Serializable{

	private static final long serialVersionUID = 1351676487838419159L;
	
	private int quantidade;
	private String local;

	@OneToOne(cascade=CascadeType.ALL) 
	@JoinTable(name="produto_turma", 
			   joinColumns={@JoinColumn(name="IdProduto", 
			   	referencedColumnName="id")}, 
			   inverseJoinColumns={@JoinColumn(name="IdTurma", 
			   	referencedColumnName="id")})
	@NotFound(action = NotFoundAction.IGNORE)
	private Turma turma;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdItem", referencedColumnName = "ID", nullable = false, unique = false)
	private Item item;
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
}