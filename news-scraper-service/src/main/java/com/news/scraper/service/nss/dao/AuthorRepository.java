package com.news.scraper.service.nss.dao;

import org.jsoup.select.Elements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.news.scraper.service.nss.model.Author;



@Repository
public interface AuthorRepository extends JpaRepository< Author, String> {

	void saveAll(String text);


}

