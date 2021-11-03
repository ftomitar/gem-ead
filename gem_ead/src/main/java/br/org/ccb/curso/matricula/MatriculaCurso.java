package br.org.ccb.curso.matricula;

import lombok.Data;

@Data
public class MatriculaCurso {
	private String curso;
	private String disciplina;
	private String instrumento;
	private String periodoLetivo;
	private String status;
}
