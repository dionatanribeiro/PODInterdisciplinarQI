package br.edu.qi.euroschool.ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.edu.qi.euroschool.dao.TurmaDao;
import br.edu.qi.euroschool.model.Turma;

@WebService
public class TurmaWS {

	@WebMethod
	public List<Turma> getTurmas(Date inicio, Date fim) {
		TurmaDao dao = new TurmaDao();
		ArrayList<Turma> turmasNoPeriodio = (ArrayList<Turma>) dao.selectByPeriodo(inicio, fim);
		if (turmasNoPeriodio != null) {
			return turmasNoPeriodio;
		} else {
			return null;
		}
	}

}
