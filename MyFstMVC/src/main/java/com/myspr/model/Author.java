package com.myspr.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {

	String authorName;
	@Id
	int authorId;
	String authorInterest;
	String authorNumber;
	public String getAuthorInterest() {
		return authorInterest;
	}
	public void setAuthorInterest(String authorInterest) {
		this.authorInterest = authorInterest;
	}
	public String getAuthorNumber() {
		return authorNumber;
	}
	public void setAuthorNumber(String authorNumber) {
		this.authorNumber = authorNumber;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
