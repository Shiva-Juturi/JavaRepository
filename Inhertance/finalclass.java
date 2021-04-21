package com.corejava.Inhertance;

final public class finalclass {

	int a = 40;
	void finalmethod() {
		a = a + 10;
		System.out.println("Final class method also final " + a);
		System.out.println("Final class Variables not final " + a);
	}

	public static void main(String[] args) {
		finalclass tc = new finalclass();
		tc.finalmethod();
	}
}
