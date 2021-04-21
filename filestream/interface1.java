package com.corejava.filestream;

interface ifr
{int a=10;

}
interface itr
{int a=100;
}

public class interface1 implements ifr,itr
{  
	public void m1(){
				
		System.out.println("m1 method"+ itr.a);
		System.out.println("m1 method"+ ifr.a);
		}
	public static void main(String[] agrs)
	{
		new interface1().m1();
}
}


