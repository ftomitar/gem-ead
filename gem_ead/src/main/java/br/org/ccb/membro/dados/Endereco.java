package br.org.ccb.membro.dados;

import lombok.Data;

@Data
public class Endereco {
	private String cep;
	private String endereco;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String UF;
}
