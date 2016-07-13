package com.aep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

	@RequestMapping("/hi")
	public @ResponseBody String sayHi() {
		return "Hi Buddy..";
	}

	@RequestMapping("howru")
	public @ResponseBody String sayImGood() {
		return "Thank you, I'm fine. What about you? ";
	}
}
