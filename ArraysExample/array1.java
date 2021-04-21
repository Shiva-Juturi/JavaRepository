package com.corejava.ArraysExample;


class EMP2
{ int eid;
	String ename;
	EMP2(int eid,String ename)
	{
		this.eid=eid;
	this.ename=ename;
	}
}

public class array1 {

	 // MY PROGRAM
	
	public  static void main(String [] args)
		{
		EMP2 e1 =new EMP2(111,"sambasiva");
		EMP2 e2 =new EMP2(222,"sambasiva2");
		EMP2 e3 =new EMP2(333,"sambasiva333");
			EMP2 [] e = new EMP2[6];
			e[0]=e1;
			e[2]=e2;
			e[4]=e3;
		for (Object ss :e)
			{
		 if (ss instanceof EMP2)
		 { EMP2 ed =(EMP2) ss;
		 System.out.println(ed.eid+ "  --------------"+ed.ename);
		 }
		 if (ss == null )
		 {System.out.println(ss);
		 }
			} } 
	}


