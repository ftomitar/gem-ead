package br.org.ccb.curso.inscricao;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface InscricaoRepository extends MongoRepository<Inscricao, String> {

}
