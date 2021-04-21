package com.corejava.AllExamples;

public class varaible {
	
	int a=10;
	static int b=20;
void display() {		
		System.out.println("instance Variable "+a);
		System.out.println("Static  Variable "+b);
		
	}
	public static void main(String[] args) {
		varaible v= new varaible();
		varaible v1= new varaible();
		++v.a;
		++v.b;
		v.display();
		System.out.println("Second variable is created ");
		v1.display();
		
	}
	

}
