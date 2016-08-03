package com.aep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aep.domain.enums.GenderType;
import com.aep.service.RegisterService;

/**
 * 
 * @author emrah.pekesen
 *
 */
@Controller
public class RegisterController {

	@Autowired
	RegisterService registerService;

	@RequestMapping("/register")
	public String register(Model model) {
		return "register";
	}

	@RequestMapping("/registerPerson")
	public String registerPerson(@RequestParam String personName, @RequestParam String personSurname,
			@RequestParam String personGender) {
		registerService.createPerson(personName, personSurname, GenderType.valueOf(personGender));
		return "register";
	}

}
