package com.news.scraper.service.nss.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.news.scraper.service.nss.dao.AuthorRepository;
import com.news.scraper.service.nss.model.Author;



@Service
public class AuthorService{
	
	@Autowired
	AuthorRepository authorRepository;
	

public List<Author> getAuthors(){
	return authorRepository.findAll();

}
public List<Author> getAuthorbyDate(Date date) {
	
	return authorRepository.findAllById((Iterable<String>) date);
}
}
