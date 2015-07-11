package br.edu.qi.euroschool.core;

import javax.persistence.MappedSuperclass;

import br.edu.qi.euroschool.dto.WeakDto;

//Classes que possuem apenas a descrição.
@MappedSuperclass
public abstract class WeakModel extends AbstractEntity {

	private String descricao;
	
	public WeakModel (String descricao){
		super();
		this.descricao = descricao;
	}
	public WeakModel (){
		super();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	} 
	
	public WeakDto toDto(){
		return new WeakDto(getId(),getDescricao());
	}
	
}
