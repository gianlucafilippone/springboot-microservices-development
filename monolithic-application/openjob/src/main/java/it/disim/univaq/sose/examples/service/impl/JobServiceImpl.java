package it.disim.univaq.sose.examples.service.impl;

import org.springframework.stereotype.Service;

import it.disim.univaq.sose.examples.model.Job;
import it.disim.univaq.sose.examples.service.JobService;

@Service
public class JobServiceImpl extends CrudServiceImpl<Job, Long> implements JobService {

}
