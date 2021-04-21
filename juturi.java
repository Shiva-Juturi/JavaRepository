class  juturi
{
	
	int a=200;
	int b=400;
	static String c ="Karthikeya";
	static String d ="vishnu";
void m1()
	{
System.out.println(a);
System.out.println(b);
System.out.println(juturi.c);
System.out.println(juturi.d);
System.out.println("iNSTANCE method END");
	 int c1=0;
	  	++c1;
	System.out.println("count   C1:  "+c1);
	juturi s= new juturi();
	s.m2();
	}
	static void m2(){

		juturi s= new juturi();
		System.out.println("iNSTANCE VARIABLE   "+s.a);
	System.out.println("iNSTANCE VARIABLE   "+s.b);
	System.out.println("STATIC VARIABLE  "+juturi.c);
	System.out.println("STATIC VARIABLE  "+juturi.d);
	
	System.out.println("STATIC VARIABLE +++++++++++++++++++++++++++++++++++++++ ");
	System.out.println("count   C2:  "+c2);
System.out.println("count   C1:  "+c1);

	
	}

	
	public static void main(String[] args) 
	{
		juturi x =new juturi();
		x.m1();
		m2();
		}
}
