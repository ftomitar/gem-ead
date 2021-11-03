package br.org.ccb.membro;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MembroRepository extends MongoRepository<Membro, String> {

}
