package com.news.scraper.service.nss.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;

import com.news.scraper.service.nss.dao.AuthorRepository;

public class DataScrapingService {

	@Autowired
	AuthorRepository authorRepository;
	
	Document document=Jsoup.connect("https://www.thehindu.com/archive/").get();
	
	Elements titles = document.getElementsByClass("title");
	
    for(Element title1 : titles) {
    	authorRepository.saveAll(title1.text());;
     }
}


