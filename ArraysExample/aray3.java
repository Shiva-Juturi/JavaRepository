package com.corejava.ArraysExample;

class EMP3 {
	int eid;
	String ename;

	EMP3(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}
}

public class aray3 {

	public static void main(String []args)

	{

		EMP3 e1 = new EMP3(111, "sambasiva");
		EMP3 e2 = new EMP3(222, "sambasiva2");
		EMP3 e3 = new EMP3(333, "sambasiva333");
		EMP3[] e = new EMP3[3];
		e[0] = e1;
		e[1] = e2;
		e[2] = e3;
		for (EMP3 ss : e) {
			System.out.println(ss);
		}

	}

}
