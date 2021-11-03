package br.org.ccb.membro;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.org.ccb.membro.dados.DadosCCB;
import br.org.ccb.membro.dados.DadosPessoais;
import lombok.Data;

@Data
@Document(collection="membro")
public class Membro {
	@Id
	private String codigo;
	private DadosPessoais dadosPessoais;
	private DadosCCB dadosCcb;
}
