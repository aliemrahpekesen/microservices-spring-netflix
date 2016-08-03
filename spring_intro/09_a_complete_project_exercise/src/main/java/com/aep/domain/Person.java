package com.aep.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.aep.domain.enums.GenderType;

/**
 * 
 * @author emrah.pekesen
 *
 */
@Entity
public class Person {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String surname;
	private GenderType gender;

	public Person() {
		super();
	}

	public Person(String name, String surname, GenderType gender) {
		this();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
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

	public GenderType getGender() {
		return gender;
	}

	public void setGender(GenderType gender) {
		this.gender = gender;
	}

}
