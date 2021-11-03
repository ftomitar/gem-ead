package br.org.ccb.curso.disciplina;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="disciplina")
public class Disciplina {
	@Id
	private String codigo;
	private String curso;
	private String disciplina;
	private List<String> aula;
}
