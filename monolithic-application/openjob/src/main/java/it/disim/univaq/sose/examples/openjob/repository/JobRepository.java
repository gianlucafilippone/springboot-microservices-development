package it.disim.univaq.sose.examples.openjob.repository;

import org.springframework.stereotype.Repository;

import it.disim.univaq.sose.examples.openjob.model.Job;

@Repository
public interface JobRepository extends CrudRepository<Job, Long>{

}
