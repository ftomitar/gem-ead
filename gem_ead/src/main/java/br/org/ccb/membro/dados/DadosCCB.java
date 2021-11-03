package br.org.ccb.membro.dados;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="matricula")
public class DadosCCB {
	@Id
	private String localidade;
	private String dataBatismo;
	private Boolean paisSaoCrentes;
	private String instrumentoPretendido;
	private Telefone telefones;
	private List<String> cargos;
}
