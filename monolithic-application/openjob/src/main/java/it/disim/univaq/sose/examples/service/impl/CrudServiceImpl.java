package it.disim.univaq.sose.examples.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import it.disim.univaq.sose.examples.repository.CrudRepository;
import it.disim.univaq.sose.examples.service.CrudService;

public class CrudServiceImpl<Entity, Key> implements CrudService<Entity, Key>{

	@Autowired
	protected CrudRepository<Entity, Key> repository;
	
	@Override
	public List<Entity> findAll() {
		return repository.findAll();
	}

	@Override
	public Entity findByKey(Key key) {
		return repository.findById(key).orElse(null);
	}

	@Override
	public void create(Entity entity) {
		repository.save(entity);
	}

	@Override
	public void update(Entity entity) {
		repository.save(entity);
	}

	@Override
	public void delete(Key key) {
		repository.deleteById(key);
	}

}
