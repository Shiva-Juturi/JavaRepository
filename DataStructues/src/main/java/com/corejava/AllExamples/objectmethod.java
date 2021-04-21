package com.corejava.AllExamples;

public class objectmethod {

	public static void main(String[] args) {

		employee ee = new employee(100);
		employee ee1 = new employee(200);
		employee ee2 = new employee(200, 300);

		check ck = new check();
		System.out.println("ee  obj " + ee.id + "EE1   " + ee1.id);
		System.out.println(" after swap ee  obj " + ee.id + "  after swap " + "EE1   " + ee1.id);
		
		System.out.println("=============================================================");

		System.out.println(" Before swap1 ee  obj " + ee2.id3 + "  Before swap1 " + "EE1   " + ee2.id4);
		ck.swap1(ee2);
		System.out.println(" after swap1 ee  obj " + ee2.id3 + "  after swap1 " + "EE1   " + ee2.id4);

	}

}
