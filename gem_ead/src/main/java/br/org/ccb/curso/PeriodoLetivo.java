package br.org.ccb.curso;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class PeriodoLetivo {
	@Id
	private String id;
	private String periodoLetivo;
}
