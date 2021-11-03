package br.org.ccb.curso.inscricao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="inscricao")
public class Inscricao {
	@Id
	private String codigo;
	private String localidade;
	private String cidade;
	private String estado;
	private String nome;
	private InscricaoCurso inscricaoCurso;
	private String email;
}
