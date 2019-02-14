/**
 * 
 */
/**
 * @author IBM
 *
 */
package com.news.scraper.service.nss.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="NewsArticles")
public class NewsArticles{
	@Id
	
	@OneToOne
	private Author author;
	private String article_title;
	private String description;
	private String tags;
	private String news_categories;
	private String city;
	private Date date= new Date();
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getArticle_title() {
		return article_title;
	}
	public void setArticle_title(String article_title) {
		this.article_title = article_title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		description = description;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getNews_categories() {
		return news_categories;
	}
	public void setNews_categories(String news_categories) {
		this.news_categories = news_categories;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public NewsArticles(Author author, String article_title, String description, String tags, String news_categories,
			String city, Date date) {
		super();
		this.author = author;
		this.article_title = article_title;
		description = description;
		this.tags = tags;
		this.news_categories = news_categories;
		this.city = city;
		this.date = date;
	}
	public NewsArticles() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}