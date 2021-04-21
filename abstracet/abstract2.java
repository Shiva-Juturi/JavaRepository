package com.corejava.abstracet;

public class abstract2 extends abstract1 {
	
	void m3() {
		System.out.println("child m3(abstract implement)");
	}

	public static void main(String[] args) {
			
		abstract2 ab = new abstract2();
		ab.m1();
		ab.m2();
		ab.m3();
		ab.m4();
		abstract0 aparent = new abstract2();
		aparent.m1();
				aparent.m2();
		aparent.m3();
		aparent.m4();

	}


}
