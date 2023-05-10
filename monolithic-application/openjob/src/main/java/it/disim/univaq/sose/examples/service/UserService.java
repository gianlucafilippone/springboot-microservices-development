package it.disim.univaq.sose.examples.service;

import java.util.Optional;

import it.disim.univaq.sose.examples.model.User;

public interface UserService extends CrudService<User, Long> {

	Optional<User> findByUsername(String username);
}
