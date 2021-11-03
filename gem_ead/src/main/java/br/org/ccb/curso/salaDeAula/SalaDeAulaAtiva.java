package br.org.ccb.curso.salaDeAula;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SalaDeAulaAtiva {
	private String id;
	private String curso;
	private String disciplina;
	private String periodoLetivo;
	private int qtdAlunos;
	private int capacidade;
	private String serviceId;
	private String url;
	
	public boolean possuiVagas() {
		return qtdAlunos < capacidade;
	}
}