package com.corejava.AllExamples;

public class instancevariable implements Cloneable {

	int a = 10; // instance variable
	static int b = 20; // static variable
	int c;
	boolean d;

	synchronized void addition() {
		System.out.println("   Addition of  " + (a + instancevariable.b));
	}

	synchronized void subtract() {
		System.out.println("   subtrction  of  " + (a - instancevariable.b));
	}

	public static void main(String[] args) {
		// static area
		instancevariable in = new instancevariable();
		instancevariable t = new instancevariable();
		System.out.println(in.a);
		System.out.println(in.b);
		System.out.println(in.a + instancevariable.b);
		in.addition();
		in.subtract();
		t.addition();
		t.subtract();
		System.out.println(" new obj Tvaraible " + t.c);
		System.out.println(" new obj Tvaraible " + t.d);
		System.out.println("clone of variabe  before clone" + in.a);
		System.out.println("Clone of variable before clone  b " + instancevariable.b);
		//in.a = 20;
		//in.b = 30;
		instancevariable t2 = in;
		//
		// t2.a=1000;
		// t2.b=2000;
		System.out.println(t.a);
		System.out.println(instancevariable.b);

		System.out.println("clone of variabe " + t2.a);
		System.out.println("Clone of variable b " + t2.b);

	}
}
