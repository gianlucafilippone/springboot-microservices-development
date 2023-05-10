package it.disim.univaq.sose.examples.service;

import java.util.List;

public interface CrudService<Entity, Key> {

	List<Entity> findAll();

	Entity findByKey(Key key);

	void create(Entity entity);

	void update(Entity entity);

	void delete(Key key);
}
