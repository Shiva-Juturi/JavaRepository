package com.corejava.Inhertance;

public class shanmukha extends karthikeya {

	int a=10;
	int b=20;
	void m1() {
		System.out.println("My Name Is Shanmukha Sri Krishna ");
	}
	void m2() {
		this.m1();
		super.m1();
		super.m2();		
		System.out.println("i am belongs to Juturi Family");
	}

}
