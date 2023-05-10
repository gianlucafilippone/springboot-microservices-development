package it.disim.univaq.sose.examples.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.disim.univaq.sose.examples.model.Job;
import it.disim.univaq.sose.examples.model.User;
import it.disim.univaq.sose.examples.service.JobService;
import it.disim.univaq.sose.examples.service.UserService;

@RestController
@RequestMapping("/job")
public class JobController {

	@Autowired
	private JobService jobService;

	@Autowired
	private UserService userService;

	@GetMapping
	public ResponseEntity<List<Job>> getAllJobs() {
		return new ResponseEntity<List<Job>>(jobService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Job> getJobById(@PathVariable("id") Long id) {
		return new ResponseEntity<Job>(jobService.findByKey(id), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Void> createJob(@RequestBody Job job) {
		jobService.create(job);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	@PutMapping
	public ResponseEntity<Void> updateJob(@RequestBody Job job) {
		jobService.update(job);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteJob(@PathVariable("id") Long id) {
		jobService.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	@GetMapping("/apply/{username}/{id}")
	public ResponseEntity<Void> applytoJob(@PathVariable("username") String username, @PathVariable("id") Long id) {
		Job job = jobService.findByKey(id);
		User user = userService.findByUsername(username).orElseThrow();
		job.getApplicants().add(user);
		jobService.update(job);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}