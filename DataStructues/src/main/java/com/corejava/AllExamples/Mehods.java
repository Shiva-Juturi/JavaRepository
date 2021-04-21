package com.corejava.AllExamples;

public class Mehods {
	int a=100;
	static int b=200;
	void addition (int c,int d) {
		int e=c+d;
		System.out.println("This  varai=bale "+(this.a+this.b));
			System.out.println("sum of c and b"+e);
				}
	
	static void sub (int a,int b) {
		int f=a-b;
		//System.out.println("local variable"+(this.a-this.b));
		
			System.out.println("sum of a and b"+f);
	}
	
		public static void main(String[] args) {
		Mehods m =new Mehods();
		m.addition(20, 30);
		Mehods.sub(30,40);
		
		}
		
}
