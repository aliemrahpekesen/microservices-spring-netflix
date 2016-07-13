package com.aep.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.aep.domain.Email;

@RestResource(path="emails",rel="emails")
public interface EmailRepository extends CrudRepository<Email, Long> {

}
