package br.edu.qi.euroschool.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.model.weak.Deficiencia;

@ManagedBean(name="deficienciaService", eager = true)
@ApplicationScoped
public class DeficienciaService {

	@EJB(beanName = "DeficienciaBean")
	GenericBean<Deficiencia> bean;
	
	private List<Deficiencia> listaDeficiencia;

	@PostConstruct
    public void init() {
		listaDeficiencia = bean.selectAll();
	}
	
	public List<Deficiencia> getListaDeficiencia() {
		return listaDeficiencia;
	}
}
