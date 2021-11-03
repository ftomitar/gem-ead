package br.org.ccb.curso.administracao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdministracaoRepository extends MongoRepository<Administracao, String> {

	List<Administracao> findByEstadoAndCidadeAndSetorAndLocalidade(String estado, String cidade, String setor, String localidade);

}
