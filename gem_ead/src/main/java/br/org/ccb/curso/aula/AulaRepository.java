package br.org.ccb.curso.aula;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AulaRepository extends MongoRepository<Aula, String> {

	List<Aula> findByCursoAndDisciplinaOrderByAula(String curso, String disciplina);

}
