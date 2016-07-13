package com.aep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aep.domain.Person;
import com.aep.repository.PersonRepository;

@RestController
public class PersonController {

	@Autowired
	PersonRepository personRepository;

	@RequestMapping("/person")
	public void enrollPerson(@RequestBody Person person) {
		personRepository.save(person);
	}

	@RequestMapping("/getAllPersons")
	public List<Person> getAllPersons() {
		return personRepository.findAll();
	}

}
