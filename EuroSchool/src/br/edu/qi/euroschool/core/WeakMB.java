package br.edu.qi.euroschool.core;

public abstract class WeakMB extends AbstractMB{
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public void validaCampos() {
		if (this.descricao.isEmpty()){
			
		}
	}	
	
}
