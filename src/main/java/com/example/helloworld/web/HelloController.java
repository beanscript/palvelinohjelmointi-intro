package com.example.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// Controller annotaatio (@) tarvitaan, jotta luokka ymmärtää olla kontrolleri, eli konepellin alla siellä on mm servlet
// Responsebody annotaatio tarkoittaa, että freimis näyttää returnissa mainitun tekstin tai olion näytöllä
@Controller
@ResponseBody

public class HelloController {
	// requestmapping annotaatiolla sidotaan koodi tiettyyn endpointtiin - wildcard * tarkoittaa että kaikki tähän
	@RequestMapping("/index")
	public String index() {
		return "This is the main page";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "This is the contact page";
	}
	
	@RequestMapping("/hello")
	public String hello(@RequestParam(name="location") String location, @RequestParam(name="name") String name) {
		return "Welcome to the " + location + " " + name + "!";
	}

}
