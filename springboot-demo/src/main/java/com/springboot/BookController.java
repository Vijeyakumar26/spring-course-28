package com.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {//Simple REST Controller
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return Arrays.asList(new Book(2,"Oracle Corp", "Java Foundation"),new Book(3,"Oracle Corp", "Oracle SQL"));
	}

}
