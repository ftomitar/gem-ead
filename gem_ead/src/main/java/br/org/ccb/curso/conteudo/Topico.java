package br.org.ccb.curso.conteudo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Topico extends Conteudo{
	private String titulo;
	private String suporte;
	private String url;
	private String texto;
	
	
}