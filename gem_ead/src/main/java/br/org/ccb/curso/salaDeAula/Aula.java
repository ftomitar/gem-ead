package br.org.ccb.curso.salaDeAula;

import java.util.List;

import lombok.Data;

@Data
public class Aula {
	private String aula;
	private List<Avaliacao> avaliacoes;
}
