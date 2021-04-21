abstract class abst 
{  abstract void m();
	abstract void m2();
void m3()
	{ System.out.println("abst root");}
}

class child1 extends abst
{ void m(){ System.out.println("child m1");}
	void m2() { System.out.println("child m2 asb");}
	void m6() { System.out.println("child m6");}


	public static void main(String[] args) 
	{
		child1 c1= new child1();
		c1.m();
		c1.m2();
		c1.m3();
		c1.m6();
		//
		abst p=new child1();
		p.m();
		p.m2();
		p.m3();
		//p.m6();
	
	child1 ch1=(child1)p;
	ch1.m6();
	}
}
