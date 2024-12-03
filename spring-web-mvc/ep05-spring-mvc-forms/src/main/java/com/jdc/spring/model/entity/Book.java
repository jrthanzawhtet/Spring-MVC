package com.jdc.spring.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String googleId;
	
	private String title;

	
	public enum Genre{
		Romance,ScienceFiction,Mystery,Horror,Thrillers,ActionAdventure,	
		HistoricalFiction,ContemporaryFiction
	}
}
