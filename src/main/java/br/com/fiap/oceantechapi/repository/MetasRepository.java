package br.com.fiap.oceantechapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.oceantechapi.model.Metas;

@Repository
public interface MetasRepository extends MongoRepository<Metas, String> {

}
