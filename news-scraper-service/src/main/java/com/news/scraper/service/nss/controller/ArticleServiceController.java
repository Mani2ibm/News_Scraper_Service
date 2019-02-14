package com.news.scraper.service.nss.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.news.scraper.service.nss.service.NewsArticlesService;


@RestController
public class ArticleServiceController<NewsArticles> {

	@Autowired
	private NewsArticlesService articlesService;
	
	
	@GetMapping("/nss/search/articles/{authorname}")
	public ResponseEntity<NewsArticles> getArticlesbyAuthorName(@PathVariable(value="authorname") Iterable<String> authorname){
		return (ResponseEntity<NewsArticles>) articlesService.getArticlesbyAuthorName(authorname);
	 
	}
	
	@GetMapping("/nss/search/articles/{article_title}/{desc}")
	public ResponseEntity<NewsArticles> getArticlesbytitleAndDesc(@PathVariable(value="article_title") Iterable<String> article_title, @PathVariable(value="desc") Iterable<String> description){
		return (ResponseEntity<NewsArticles>) articlesService.getArticlesbyTitleandDesc(article_title , description);
		
	}
	
	@GetMapping("/nss/search/articles/{date}")
	public ResponseEntity<NewsArticles> getArticlesbyDate(@PathVariable(value="date") Date date){
		return (ResponseEntity<NewsArticles>) articlesService.getArticlesbyDate(date);
		
	}
	@GetMapping("/nss/search/articles/{city}")
	public ResponseEntity<NewsArticles> getArticlesbyCity(@PathVariable(value="city") Iterable<String> city){
		return (ResponseEntity<NewsArticles>) articlesService.getArticlesbyCity(city);
		
	}
	@GetMapping("/nss/search/articles/{categories}")
	public ResponseEntity<NewsArticles> getArticlesbyCategories(@PathVariable(value="categories") Iterable<String> categories){
		return (ResponseEntity<NewsArticles>) articlesService.getArticlesbyCategories(categories);
		
	}
}
