package br.org.ccb.curso.aluno;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="aluno")
public class Aluno {
	@Id
	private String codigo;
	private String localidade;
	private String cidade;
	private String estado;
	private String nome;
	private List<String> cursos;
	private String email;
}
