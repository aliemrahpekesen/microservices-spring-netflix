package com.aep.controller;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aep.domain.Email;
import com.aep.domain.Person;

//@Controller
@RestController
public class PersonController {

	private Person person;

	@PostConstruct
	private void init() {
		Set<Email> emails = new HashSet<>();
		emails.add(new Email("1", "aliemrahpekesen@gmail.com", true));
		emails.add(new Email("2", "emrahpekesen@gmail.com", true));

		person = new Person("1", "Ali Emrah", "PEKESEN", emails);
	}

//	@RequestMapping("/getPersonDetails")
//	public @ResponseBody Person getPersonDetails() {
//		return person;
//	}
	
	@RequestMapping("/getPersonDetails")
	public Person getPersonDetails() {
		return person;
	}
	
	@RequestMapping("/getJustEmail")
	public Email getJustEmail() {
		return new Email("1", "aliemrahpekesen@gmail.com", true);
	}

}
