package it.disim.univaq.sose.examples.openjob.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CrudRepository<Entity, Key> extends JpaRepository<Entity, Key>{

	
}
