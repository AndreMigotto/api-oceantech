package br.com.fiap.oceantechapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.oceantechapi.model.Objetivos;
import br.com.fiap.oceantechapi.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	void insert(Objetivos objetivos);
}
