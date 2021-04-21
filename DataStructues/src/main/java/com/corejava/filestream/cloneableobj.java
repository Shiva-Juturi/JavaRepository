package com.corejava.filestream;

	 public class cloneableobj  implements Cloneable  
	{	
			int a=10;
			int b=20;
		public static void main(String[] args) throws Exception 
		{ 
			cloneableobj t=new cloneableobj();
		
		System.out.println(t.a);
		System.out.println(t.a);
		t.a=50;
		t.b=60;
		System.out.println(t.a);
		System.out.println(t.a);
		cloneableobj  t1=(cloneableobj ) t.clone();
		t.a=500;
		t.b=600;
		System.out.println(t.a);
		System.out.println(t.a);
		System.out.println(t1.a);
		System.out.println(t1.b);


		}
	}

