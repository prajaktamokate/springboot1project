package com.springbootjunit.entity;
import java.time.LocalDate;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_movies")
public class Movie 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(max=20)
	@Column(name="name")
	private String name;
	
	@Size(max=20)
	@Column(name="genera")
	private String genera;
	
	@Column(name="releaseDate")
	private LocalDate releaseDate;

	public Object getGenera() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setGenera(Object genera2) {
		// TODO Auto-generated method stub
		
	}

	public Object getReleaseDate() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setReleaseDate(Object releaseDate2) {
		// TODO Auto-generated method stub
		
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
}