package it.disim.univaq.sose.examples.repository;

import org.springframework.stereotype.Repository;

import it.disim.univaq.sose.examples.model.Job;

@Repository
public interface JobRepository extends CrudRepository<Job, Long>{

}
