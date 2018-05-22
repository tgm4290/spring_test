package com.tgm.spring_test.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Account {
	@Id
	@GeneratedValue
	private Long id;
	
	private String userName;
	 
	@JsonIgnore
	private String password;
	
	@OneToMany(mappedBy = "account")
	private Set<Bookmark> bookmarks = new HashSet<>();
	
	@SuppressWarnings("unused")
	private Account() {}
	
	public Account(final String userName, final String password){
		this.userName = userName;
		this.password = password;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public Set<Bookmark> getBookmarks() {
		return bookmarks;
	}
}
