package com.ye.demo.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class controller {
	
	@RequestMapping(value = "/basic", method = RequestMethod.GET)
	public String sayHello() {
		return "<h2>hello</h2>";
	}
	
	@RequestMapping(value = "/user_entry")
	public String userForm() {
		return " <form action=\"/greeting/user_greeting\" method = \"POST\">\n"
		+ "  <label for=\"fname\">First name:</label><br>\n"
		+ "  <input type=\"text\" id=\"fname\" name=\"fname\"><br>\n"
		+ "  <label for=\"lname\">Last name:</label><br>\n"
		+ "  <input type=\"text\" id=\"lname\" name=\"lname\"><br><br>\n"
		+ "  <input type=\"submit\" value=\"Submit\">\n"
		+ "</form> ";
	}
	
	@RequestMapping(value = "/user_greeting", method = RequestMethod.POST)
	public String printUserGreeting(@RequestParam String fname, @RequestParam String lname) {
		return "hello"+ fname + " " + lname + "~~~";
		
	}
	
	@RequestMapping(value = "/orders/{id}", method = RequestMethod.GET)
	public String getOrder(@PathVariable String id) {
		return "OrderID" + id;
	}
}
