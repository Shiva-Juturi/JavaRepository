package com.corejava.interface1;
interface itr { // by default abstract
	void m5(); // interface methods by default abstract and public
	void m6();
	void m7();
	
	int a=20;// by default  public static final
	//a=a+20;
}
abstract public class interface0 implements itr {
	public void m5() {  // if you are not declare public it will throws Error 
		System.out.println("Interface Method  m5  ");
	}
	public void m6() {
		System.out.println("Interface Method  m6  ");
	}
	
}