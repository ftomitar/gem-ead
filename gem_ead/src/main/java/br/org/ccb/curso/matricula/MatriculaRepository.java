package br.org.ccb.curso.matricula;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MatriculaRepository extends MongoRepository<Matricula, String> {

}
