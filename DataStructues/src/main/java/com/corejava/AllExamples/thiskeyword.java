package com.corejava.AllExamples;

public class thiskeyword {
	int x = 0;

	thiskeyword() {
		this(55);
		this.access();
	}

	thiskeyword(int a) {
		this.x = a;
		//System.out.println(x);
	}

	void access() {
		System.out.println("access method" + x);
	}
	public static void main(String[] args) {
		thiskeyword th =new thiskeyword();
		
	}
	}