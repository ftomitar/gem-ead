package br.org.ccb.curso.salaDeAula;

import java.text.MessageFormat;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "salaDeAula")
public class SalaDeAula {
	@Id
	private String id;
	private String numeroSala;
	private String nomeSalaAula;
	private String localidade;
	private String cidade;
	private String estado;
	private String setor;
	private String curso;
	private String disciplina;
	private String status;
	private String periodoLetivo;
	private int capacidade;
	private String url;
	private String serviceId;
	private List<Aula> aulas;
	private List<Aluno> alunos;
	private List<Professor> professores;

	/*
	 * Template para nome de sala de aula: Ex: Sala 1: GEM - Módulo 1 (Guarulhos -
	 * São Paulo / Setor 1 - Gopoúva)
	 */
	private String nomeSalaAulaTemplate = "Sala {0}: {1} - {2}({3} - {4} / {5} - {6})";

	public void defineNomeSalaDeAula() {
		this.nomeSalaAula = MessageFormat.format(
				this.nomeSalaAulaTemplate, 
				this.numeroSala, 
				this.curso,
				this.disciplina, 
				this.cidade, 
				this.estado, 
				this.setor, 
				this.localidade);
	}
	
	public SalaDeAulaAtiva getSalaAulaAtiva() {
		return new SalaDeAulaAtiva(
				this.id, 
				this.curso,
				this.disciplina,
				this.periodoLetivo,
				this.alunos.size(),
				this.capacidade,
				this.serviceId,
				this.url);
	}

}
