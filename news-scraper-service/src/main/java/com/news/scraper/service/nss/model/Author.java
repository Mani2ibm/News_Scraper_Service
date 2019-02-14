package com.news.scraper.service.nss.model;

import java.util.Date;

public class Author {


private String authorName;
private Date date=new Date();
public Author(String author, Date date) {
	super();
	this.authorName = author;
	this.date = date;
}
@Override
public String toString() {
	return "Author [author=" + authorName + ", date=" + date + "]";
}
}
