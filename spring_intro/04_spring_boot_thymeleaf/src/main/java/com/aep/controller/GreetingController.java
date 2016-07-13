package com.aep.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

	@RequestMapping("/hi/{visitorName}")
	public String sayHi(Map<String,String> model, @PathVariable String visitorName) {
		model.put("visitorName", visitorName);
		return "hi";
	}
}
