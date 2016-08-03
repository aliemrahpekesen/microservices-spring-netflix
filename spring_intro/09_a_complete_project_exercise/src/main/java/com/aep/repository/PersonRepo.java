package com.aep.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.aep.domain.Person;

/**
 * 
 * @author emrah.pekesen
 *
 */
@RestResource(path="/persons",rel="persons")
public interface PersonRepo extends CrudRepository<Person, Long> {

}
