package br.edu.qi.euroschool.core;

//Classes que possuem apenas a descrição.
public class WeakModel extends AbstractModel {

	private String descricao;
	
	public WeakModel (String descricao){
		super();
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	} 
}
