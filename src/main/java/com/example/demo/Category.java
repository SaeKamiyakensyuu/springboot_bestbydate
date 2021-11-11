package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="category_code")
	private Integer category_code;
	
	@Column(name="categoryname")
	private String categoryname;

	public Integer getCategory_code() {
		return category_code;
	}

	public String getCategoryname() {
		return categoryname;
	}
	
}
	