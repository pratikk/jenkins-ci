package com.springtest.app.eclipsemaventest;

public class Story {
	 
	private String title;
	private Author author;
	private String content;
	private String pubDate;
 
	public Story () {
	}	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Author getAuthor() {
		return author;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
}
