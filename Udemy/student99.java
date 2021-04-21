package com.corejava.Udemy;

public class student99 {
	int id;
	String Name ;
	String Gender;
	
	student99(int id ,String name){
		this(name);
		this.id=id;
		
		
	}
	student99(String name){
		this.Name=name;
	}
	
	String UpdateDetails(int index,String name) {
	String oldval=this.Name;
	this.Name=name;
	return this.Name;
			
		
	}
	
}
