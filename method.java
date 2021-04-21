class  method
{
	int a=10;
	int b=20;
	int  m1( int a,int b)
	{
	System.out.println(" Static Method ");
	int c= this.a+this.b;
		return c;
	}

	public static void main(String[] args) 
	{
		method m =new method();
		int s=m.m1(12,10);
			System.out.println(" Static Method "  +s);
	

	}
}
