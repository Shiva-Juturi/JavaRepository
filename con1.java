class con1 
{   int eid;
	String  ename;
	static float esal;
	void m1()
	{
		System.out.println(" employee id  "+eid);
		System.out.println(" employee Name  "+ename);
		System.out.println(" employee esal  "+con1.esal);
	}
	con1()
	{
	eid=2001917;
	ename="sambasiva Rao";
	esal=5555.5f;
	}

	con1(int eid,String ename, float esal)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;

	}
			
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		con1 c=new con1();
		con1 c1=new con1(200,"juturi",344.0f);
		c1.m1();
		c.m1();

	}
}
