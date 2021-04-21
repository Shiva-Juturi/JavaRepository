class demo 
{
static	void m1()
	{ int i=10;
	  for (int a=1;a<=i;a++)
	  {
		for (int j=1;j<=a ;j++ )

		{
			System.out.print(j);
		}
		System.out.println();
	  }

	}
	static	void m2()
	{ int i=10;
	  for (int a=1;a<=i;a++)
	  {
		for (int j=10;j>=a ;j-- )

		{
			System.out.print(j);
		}
		System.out.println();
	  }

	}
static void tables()
	{ 
	for (int i=0;i<=1 ;i++ )
	    for (int j=0;j<=10;j++ )
	    {  System.out.print(i+"*" +j+"="+(i*j));
	    }
	System.out.println();

	}

	static  void chart(){
		for (int c=0;c<=10 ;c++ )
		{

		}

	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		demo.m1();
		demo.m2();
		demo.tables();

	}
}
