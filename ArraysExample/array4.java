package com.corejava.ArraysExample;

class EMP5 {
	int eid;
	String ename;

	EMP5(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}
}

public class array4 {

	// MY PROGRAM

	public static void main(String[] args) {
		EMP5[] a = new EMP5[5];
		a[0] = new EMP5(11, "aa");
		a[1] = new EMP5(12, "aa");
		a[2] = new EMP5(13, "aa");
		a[3] = new EMP5(114, "aa");
		a[4] = new EMP5(115, "aa");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].eid + "            " + a[i].ename);

		}

		
	}
}
