package com.corejava.AllExamples;

public class constructor {

	constructor(){
		this(60);
		System.out.println("0"+ " argu constructor  " );
	}
	
	constructor(int b) {
		int a = b;
		System.out.println("1 argu constructor  " + a);
	}

	{
		System.out.println("Instance Block ");
		}
	static {
		System.out.println("Statc block");

	}

	public static void main(String[] args) {
		constructor t = new constructor();

	}
}
