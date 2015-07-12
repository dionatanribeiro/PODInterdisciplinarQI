package br.edu.qi.euroschool.model.pessoas;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import br.edu.qi.euroschool.core.AbstractEntity;
import br.edu.qi.euroschool.model.Turma;

@Entity
public class Professor extends AbstractEntity implements Serializable{

	private static final long serialVersionUID = -2742172652694601714L;

	private String formacao;
	
	@OneToMany(mappedBy = "professor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Turma> turmas;
	
	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
}
