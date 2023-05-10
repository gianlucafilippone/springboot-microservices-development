package it.disim.univaq.sose.examples.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import it.disim.univaq.sose.examples.model.User;
import it.disim.univaq.sose.examples.repository.UserRepository;
import it.disim.univaq.sose.examples.service.UserService;

@Service
public class UserServiceImpl extends CrudServiceImpl<User, Long> implements UserService {

	@Override
	public Optional<User> findByUsername(String username) {
		return ((UserRepository) repository).findByUsername(username);
	}

}
