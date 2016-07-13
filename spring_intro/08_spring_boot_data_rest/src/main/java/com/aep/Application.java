package com.aep;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import com.aep.domain.Email;
import com.aep.domain.Person;
import com.aep.repository.PersonRepository;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}

	@Autowired
	PersonRepository personRepository;

	@PostConstruct
	public void addSomePersonsForTest() {
		Set<Email> emailsForP1 = new HashSet<>();
		emailsForP1.add(new Email(201L, "aliemrahpekesen@gmail.com", true));
		emailsForP1.add(new Email(202L, "ali.emrah.pekesen@gmail.com", false));
		Person p1 = new Person(1001L, "Emrah", "PEKESEN", emailsForP1);

		Set<Email> emailsForP2 = new HashSet<>();
		emailsForP2.add(new Email(301L, "alikivancpekesen@gmail.com", true));
		emailsForP2.add(new Email(302L, "ali.kivanc.pekesen@gmail.com", false));
		Person p2 = new Person(2001L, "Kıvanç", "PEKESEN", emailsForP2);

		personRepository.save(p1);
		personRepository.save(p2);
	}
}
