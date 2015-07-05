package br.edu.qi.euroschool.core;

import br.edu.qi.euroschool.interfaces.IManagedBean;

public abstract class AbstractMB implements IManagedBean {

	protected String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
