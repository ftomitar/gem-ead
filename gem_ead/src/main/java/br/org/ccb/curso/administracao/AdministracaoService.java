package br.org.ccb.curso.administracao;

import java.util.List;

public interface AdministracaoService {
	public List<Administracao> findAll();
	public void criarSalaLocalidade(String estado, String cidade, String setor, String localidade, String curso, String disciplina);
}
