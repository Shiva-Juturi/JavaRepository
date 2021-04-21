class con12 implements Cloneable  
{	
		int a=10;
		int b=20;
	public static void main(String[] args) throws Exception 
	{ 
	con12 t=new con12();
	
	System.out.println(t.a);
	System.out.println(t.a);
	t.a=50;
	t.b=60;
	System.out.println(t.a);
	System.out.println(t.a);
	con12 t1=(con12) t.clone();
	t.a=500;
	t.b=600;
	System.out.println(t.a);
	System.out.println(t.a);
	System.out.println(t1.a);
	System.out.println(t1.b);


	}
}
