package com.srccodes.spring.controller;
/**
 * 
 * @author IB1013
 *
 */
public class User {
	
	//Test User
	private String name = null;
	private String education = null;
	
	
	/**
	 * 
	 * @return Name Admin name
	 */
	public String getName(){
		return name;
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	public String getEducation(){
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}

}
