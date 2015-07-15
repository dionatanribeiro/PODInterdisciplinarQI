package br.edu.qi.euroschool.core;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return String.format("%s[id=%d]", getClass().getSimpleName(), getId());
	}

	@Override
	public boolean equals(Object other) {
		return (other instanceof AbstractEntity) && (id != null) ? id
				.equals(((AbstractEntity) other).id) : (other == this);
	}

	@Override
	public int hashCode() {
		return ((id != null) ? (this.getClass().hashCode() + id.hashCode())
				: super.hashCode());
	}
	
	public AbstractDto toDto(){
		return new AbstractDto(id);		
	}
}
