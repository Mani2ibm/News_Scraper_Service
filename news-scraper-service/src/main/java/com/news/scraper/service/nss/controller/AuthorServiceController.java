package com.news.scraper.service.nss.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.news.scraper.service.nss.model.Author;
import com.news.scraper.service.nss.service.AuthorService;



@RestController
public class AuthorServiceController {
	
	@Autowired
	private AuthorService authorservice;
	
	/*Search available authors
	Returns the all the available authors*/
	@GetMapping("/nss/search/authors/")
	public List<Author> getAuthors(){
		return authorservice.getAuthors();	
	}
	
/*	Search author name based on date
	Returns the all author name based on date*/
	
	@GetMapping("/nss/search/authors/{date}")
	public List<Author> getAuthorbyDate(@PathVariable Date date){
		return authorservice.getAuthorbyDate(date);
	}
}
