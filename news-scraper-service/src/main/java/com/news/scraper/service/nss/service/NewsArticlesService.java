package com.news.scraper.service.nss.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.news.scraper.service.nss.dao.AuthorRepository;
import com.news.scraper.service.nss.model.NewsArticles;


@Service
public class NewsArticlesService {
	
	@Autowired
	AuthorRepository authorRepository;
	
public List<NewsArticles> getArticlesbyAuthorName(Iterable<String> authorname){
	
	NewsArticles articles= (NewsArticles) authorRepository.findAllById((Iterable<String>) authorname);
	 
 	return (List<NewsArticles>) ResponseEntity.ok().body(articles);

}

public List<NewsArticles> getArticlesbyTitleandDesc(Iterable<String> article_title, Iterable<String> description){
	
	NewsArticles articles= (NewsArticles) authorRepository.findAllById(article_title);
	
	if(description!= null){
		NewsArticles articles1= (NewsArticles) authorRepository.findAllById(description);
		return (List<NewsArticles>) ResponseEntity.ok().body(articles1);
	}
	
	return (List<NewsArticles>) ResponseEntity.ok().body(articles);
}
 
public List<NewsArticles> getArticlesbyDate(Date date){
	NewsArticles articles= (NewsArticles) authorRepository.findAllById((Iterable<String>) date);
	return (List<NewsArticles>) ResponseEntity.ok().body(articles);
	
}

public List<NewsArticles> getArticlesbyCity(Iterable<String> city){
	NewsArticles articles= (NewsArticles) authorRepository.findAllById(city);
	return (List<NewsArticles>) ResponseEntity.ok().body(articles);
	
}

public List<NewsArticles> getArticlesbyCategories(Iterable<String> categories){
	NewsArticles articles= (NewsArticles) authorRepository.findAllById(categories);
	return (List<NewsArticles>) ResponseEntity.ok().body(articles);
	
}

}
