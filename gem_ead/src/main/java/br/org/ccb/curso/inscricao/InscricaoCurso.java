package br.org.ccb.curso.inscricao;

import lombok.Data;

@Data
public class InscricaoCurso {
	private String curso;
	private String disciplina;
	private String periodoLetivo;
	private String instrumento;
	private String status;
}
