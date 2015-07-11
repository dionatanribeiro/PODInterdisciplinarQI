package br.edu.qi.euroschool.core;

public class AbstractDto {

	public AbstractDto(Long id) {
		this.setId(id);
	}
	
	public AbstractDto() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private Long id;
}
