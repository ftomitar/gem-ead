package br.org.ccb.membro.instrutor;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="instrutor")
public class Instrutor {
	@Id
	private String codigo;
	private String localidade;
	private String cidade;
	private String estado;
	private String nome;
	private String email;
	private List<String> instrumentos;
	private List<Curso> cursos;
	
	@Data
	public class Curso{
		private String curso;
		private String disciplina;
	}
}
