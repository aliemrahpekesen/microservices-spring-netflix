package com.aep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aep.domain.Person;
import com.aep.domain.enums.GenderType;
import com.aep.repository.PersonRepo;

/**
 * 
 * @author emrah.pekesen
 *
 */
@Service
public class RegisterService {

	@Autowired
	PersonRepo personRepo;

	public Person createPerson(String name, String surname, GenderType genderType) {
		return personRepo.save(new Person(name, surname, genderType));
	}

}
