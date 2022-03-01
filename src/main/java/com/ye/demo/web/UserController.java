package com.ye.demo.web;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ye.demo.domain.Product;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@RequestMapping(value = "/{userId}/invoices")
	public String displayUserInvoices(@PathVariable int userId, 
			@RequestParam(value = "date", required = false) Date dateOrNull) {
		return "invoice found for user" + userId + " on the date " + dateOrNull;
		// http://localhost:8080/user/22/invoices?date=12/22/2020
		// invoice found for user:22 on the date Tue Dec 22 00:00:00 PST 2020
		
		// http://localhost:8080/user/22/invoices
		// invoice found for user:22 on the date null
	}
	
	@RequestMapping(value = "/{userId}/produce_as_json")
	public List<Product> displayStringJson() {
		return Arrays.asList(new Product(1, "shoes", 89.99),
				new Product(2, "skirt", 132.99),
				new Product(3, "bag", 632.00));
	}
	
	// [{"id":1,"name":"shoes","price":89.99},{"id":2,"name":"skirt","price":132.99},{"id":3,"name":"bag","price":632.0}]
	

}
