package br.org.ccb.membro.musico;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="musico")
public class Musico {
	@Id
	private String codigo;
	private String localidade;
	private String cidade;
	private String estado;
	private String nome;
	private String dataOficializacao;
	private String email;
	private List<String> instrumentos;	
}
