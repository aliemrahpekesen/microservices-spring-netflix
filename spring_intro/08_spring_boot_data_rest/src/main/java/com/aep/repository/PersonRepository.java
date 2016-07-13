package com.aep.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.aep.domain.Person;

@RestResource(path = "persons", rel = "persons")
public interface PersonRepository extends CrudRepository<Person, Long> {
	List<Person> findAll();

	Person findByName(@Param(value = "name") String name);

	Person findByNameAndSurname(@Param(value = "ad") String name, @Param(value = "soyad") String surname);

	Person findBySurname(String surname);

	Person getEmailsById(Long id);
}
