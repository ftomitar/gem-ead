package br.org.ccb.membro.dados;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class DadosPessoais {
	@Id
	private String nome;
	private String dataNascimento;
	private String estadoCivil;
	private Endereco endereco;
	private Telefone telefones;
	private Email emails;
	private Acessibilidade acessibilidade;
}
