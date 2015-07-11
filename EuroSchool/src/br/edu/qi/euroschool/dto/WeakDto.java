package br.edu.qi.euroschool.dto;

import br.edu.qi.euroschool.core.AbstractDto;

public class WeakDto extends AbstractDto{

	public WeakDto(Long id, String descritivo) {
		this.setId(id);
		this.setDescritivo(descritivo);
	}

	public String getDescritivo() {
		return descritivo;
	}

	public void setDescritivo(String descritivo) {
		this.descritivo = descritivo;
	}

	private String descritivo;
	
}
