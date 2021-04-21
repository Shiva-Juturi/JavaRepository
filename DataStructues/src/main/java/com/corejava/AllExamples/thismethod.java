package com.corejava.AllExamples;

public class thismethod {

	int a = 10;
	int m1(int x) {
		System.out.println(this.a);
		System.out.println("X  value    ====="+x);
		return this.a;
	}
public static void main(String[] args) {
	
	thismethod tm=new thismethod();
	int y = tm.m1(100);
	System.out.println(" this keword power   "+ y);
		
}
	}
