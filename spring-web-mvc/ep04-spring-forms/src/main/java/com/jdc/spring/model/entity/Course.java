package com.jdc.spring.model.entity;

import java.time.LocalDateTime;

public class Course {
	
	private int id;
	private Level level;
	private String name;
	private int hours;
	private int fees;
	private String description;
	private LocalDateTime createAt;
	
	public enum Level{
		Basic,Intermediate,Advance
	}

}
