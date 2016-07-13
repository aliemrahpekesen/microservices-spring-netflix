package com.aep.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Person {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String surname;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "personId")
	private Set<Email> emails;

	public Person() {
		super();
	}

	public Person(Long id, String name, String surname, Set<Email> emails) {
		this();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.emails = emails;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Set<Email> getEmails() {
		return emails;
	}

	public void setEmails(Set<Email> emails) {
		this.emails = emails;
	}
}
