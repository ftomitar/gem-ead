package br.org.ccb;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CCBRepository extends MongoRepository<CCB, String> {

}
