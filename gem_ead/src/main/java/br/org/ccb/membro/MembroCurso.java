package br.org.ccb.membro;

import lombok.Data;

@Data
public class MembroCurso {
	private String curso;
	private String disciplina;
	private String instrumento;
	private String periodoLetivo;
	private String status;
}
