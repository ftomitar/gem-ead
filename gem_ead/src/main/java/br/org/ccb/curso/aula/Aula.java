package br.org.ccb.curso.aula;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.org.ccb.curso.conteudo.Conteudo;
import lombok.Data;


@Document(collection="aula")
@Data
public class Aula {
	@Id
	private String codigo;
	private String curso;
	private String disciplina;
	private String aula;
	private List<Conteudo> conteudo;
}

