package it.disim.univaq.sose.examples.openjob.service;

import java.util.Optional;

import it.disim.univaq.sose.examples.openjob.model.User;

public interface UserService extends CrudService<User, Long> {

	Optional<User> findByUsername(String username);
}
