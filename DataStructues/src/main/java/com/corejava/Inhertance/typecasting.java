package com.corejava.Inhertance;

public class typecasting extends typecasting0 {

  void m1() {
		System.out.println(" Type casting  Child  M1() ");
	}
	void m2() {
		System.out.println(" Type casting  Child  M2() ");
	}

	public static void main(String[] args) {
		typecasting0 tp=new typecasting();
		tp.m1();   // compiler time it check parent and runtime it runs child  one 
		//tp.m2(); // compiled time it checks parent  not there that why it throw  error 
		typecasting tchild =(typecasting) tp;
		tchild.m2();

	}

}
