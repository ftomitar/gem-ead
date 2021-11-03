package br.org.ccb.curso.historico;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="historico")
public class Historico {
	@Id
	private String codigo;
	private String localidade;
	private String cidade;
	private String estado;
	private String nome;
	private List<Nota> notas;
	private String curso;
	private String aprovado;
	private String disciplina;
	private String status;
	private String periodoLetivo;
	private String ultimoAcesso;
	private String email;
}
