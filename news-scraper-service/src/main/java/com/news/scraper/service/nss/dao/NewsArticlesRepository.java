package com.news.scraper.service.nss.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.news.scraper.service.nss.model.NewsArticles;



@Repository
public interface NewsArticlesRepository extends JpaRepository< NewsArticles, String>{

}
