package com.aep.domain;

import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

	private String Id;
	private String name;
	private String surname;
	private Set<Email> emails;

	public Person() {
		super();
	}

	public Person(String id, String name, String surname, Set<Email> emails) {
		this();
		Id = id;
		this.name = name;
		this.surname = surname;
		this.emails = emails;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
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
