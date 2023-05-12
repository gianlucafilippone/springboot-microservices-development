package it.disim.univaq.sose.examples.openjob.model;

import java.util.HashSet;
import java.util.Set;

import it.disim.univaq.sose.examples.openjob.model.audit.DateAudit;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "job")
public class Job extends DateAudit {

	private static final long serialVersionUID = -4709202376238238523L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_id")
	private Long id;

	@Column(nullable = false, length = 255)
	private String title;

	@Lob
	@Column
	private String description;

	@ManyToOne(optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	private User createdBy;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "job_user", joinColumns = { @JoinColumn(name = "job_id") }, inverseJoinColumns = {
			@JoinColumn(name = "user_id") })
	private Set<User> applicants = new HashSet<User>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public Set<User> getApplicants() {
		return applicants;
	}

	public void setApplicants(Set<User> applicants) {
		this.applicants = applicants;
	}
}
