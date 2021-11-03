package br.org.ccb.curso.conteudo;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Avaliacao extends Conteudo {
	private List<Pergunta> perguntas;

}