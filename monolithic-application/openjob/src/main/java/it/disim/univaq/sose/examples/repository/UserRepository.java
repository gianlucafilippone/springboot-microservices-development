package it.disim.univaq.sose.examples.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import it.disim.univaq.sose.examples.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	Optional<User> findByUsername(String username);
}
