package com.aep;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aep.domain.Person;
import com.aep.domain.enums.GenderType;
import com.aep.repository.PersonRepo;

/**
 * 
 * @author emrah.pekesen
 *
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	PersonRepo personRepo;

	@PostConstruct
	public void initData() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Emrah", "PEKESEN", GenderType.MALE));
		persons.add(new Person("Ibrahim", "BAYER", GenderType.MALE));
		persons.add(new Person("Sibel", "CANIAZ", GenderType.FEMALE));
		personRepo.save(persons);
	}

}
