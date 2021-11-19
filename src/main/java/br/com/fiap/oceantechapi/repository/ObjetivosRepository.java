package br.com.fiap.oceantechapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.oceantechapi.model.Objetivos;

@Repository
public interface ObjetivosRepository extends MongoRepository<Objetivos, String> {

}
