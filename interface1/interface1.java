package com.corejava.interface1;

public class interface1 extends interface0 {
	
	
	public void m7() {
		System.out.println("Interface Method  m7  ");
		//a=a+20;
		System.out.println(itr.a); // why i gave itr.a (a is static also)
	}
	public static void main(String[] args) {
		interface1 itrs = new interface1();
		itrs.m5();
		itrs.m6();
		itrs.m7();
		System.out.println("==================================== ");
		itr it=new interface1();
		it.m5();
		it.m6();
		it.m7();
	//	int b;
	//	itr  b =it.a;
	}

}
