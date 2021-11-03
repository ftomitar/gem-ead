package br.org.ccb.curso.aula;

import java.util.List;

public interface AulaService {
	public List<Aula> findAll();
	public List<Aula> findByCursoAndDisciplina(String curso, String disciplina);
}
