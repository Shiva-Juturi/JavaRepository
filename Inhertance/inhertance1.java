package com.corejava.Inhertance;

public class inhertance1 extends shanmukha {
	int a = 30;
	int b = 40;
	void add(int a, int b) {
		System.out.println("d+e     " + (a + b));
		System.out.println("c+d     " + (this.a + this.b));
		System.out.println("c+d     " + (super.a + super.b));
	}
	void m2() {
		System.out.println("This Sambasiva rao ");
	}
	void m5() {
		this.m2();
		super.m2();
		System.out.println("This NaliniShiva");
	}
	public static void main(String[] args) {
		inhertance1 in = new inhertance1();
		in.m1();
		in.m2();
		in.m5();
		// new inhertance1().m1();
		in.add(1000, 2000);

	}

}
