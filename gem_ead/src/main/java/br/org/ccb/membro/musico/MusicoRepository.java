package br.org.ccb.membro.musico;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MusicoRepository extends MongoRepository<Musico, String> {

}
