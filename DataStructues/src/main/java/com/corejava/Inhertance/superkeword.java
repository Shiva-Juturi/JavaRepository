package com.corejava.Inhertance;

public class superkeword extends superkeword0 {

	int c = 50;
	int d = 60;

	void m7() {
		System.out.println("Child Class m1 method " + (c + d));
	}
	void m5() {
		System.out.println("Method m5 is Called");
		this.m7();
		super.m7();
		System.out.println("Method m5 is ended ");
	}
	superkeword() {
		this(20);
		System.out.println("Child class 0 argus ");
	}

	superkeword(int a) {
		super();
		System.out.println("chid class 1 args constructor " + a);
	}
	superkeword(String b) {
		this.m5();
		System.out.println("string              "+b);
}
	public static void main(String[] args) {
		superkeword tm = new superkeword("a");
		superkeword tm1 = new superkeword();
		//tm.m5();

	}
}
