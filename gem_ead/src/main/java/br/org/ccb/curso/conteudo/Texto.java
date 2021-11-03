package br.org.ccb.curso.conteudo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Texto extends Conteudo{
	private String texto;
}