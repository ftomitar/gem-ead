package br.org.ccb.curso;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="curso")
public class Curso {
	@Id
	private String id;
	private String curso;
	private String titulo;
	private String descricao;
	private List<String> disciplinas;
}
