package br.org.ccb.curso.matricula;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="matricula")
public class Matricula {
	@Id
	private String codigo;
	private String localidade;
	private String cidade;
	private String estado;
	private String nome;
	private String email;
	private List<MatriculaCurso> cursos;
}
