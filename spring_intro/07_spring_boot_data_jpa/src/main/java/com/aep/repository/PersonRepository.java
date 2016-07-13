package com.aep.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aep.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
	List<Person> findAll();

	Person findByName(String name);

	Person findBySurname(String surname);

	Person getEmailsById(Long id);
}
