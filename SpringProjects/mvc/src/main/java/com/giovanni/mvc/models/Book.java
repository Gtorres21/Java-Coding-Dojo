package com.giovanni.mvc.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity					 //Declares that it is going to be apart of MySql 
@Table(name="books")     // gives the table name of the model
public class Book {
	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Generates an auto incrementing
	private Long id;
	
	@NotNull(message= "Title is required")
	@Size(min = 5, max = 200)
	private String title;
	
	@NotNull(message ="Description is required!") //Validation for not null
	@Size(min = 5, max=200) //Validation for Strings
	private String description;
	
	@NotNull
	@Size(min = 3, max= 40)
	private String language;
	
	@NotNull
	@Min(100) //Validation for Integers
	private Integer numberOfPages;
	
	
	@Column(updatable=false) // Allows for the createdAt column to not be updated after creation
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	
	//	Constructors
	public Book() {}
	
	public Book(String title, String desc, String lang, int pages) {
		this.title = title;
		this.description = desc;
		this.language = lang;
		this.numberOfPages = pages;
	}

		
	//Getters and Setters
  
    public Long getId() {
	return id;
    }
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public Integer getNumberOfPages() {
		return numberOfPages;
	}
	
	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}
	

	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	@PrePersist
	protected void onCreate(){
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate(){
		this.updatedAt = new Date();
	}
	
	
	
}
