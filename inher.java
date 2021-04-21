class Parent
{
	void m1()
	{ System.out.println("0 agr method");

	}
 int  m2(int a)
	{ System.out.println("1 agr method");
return a;
}
void m1(char ch){
	System.out.println("cahr arg");
}
}
class child extends Parent{
 void m1(){
	 System.out.println("child class ");}

	 int  m2(int a)
	{ System.out.println("child agr method");
return a;
}
void m4(){
	System.out.println("m4 Method");
}

public static void main(String [] args)
	{
	child a =new child();
	a.m1();
	a.m2(10);
	a.m1('a');
 int c=10;
c=c+10;
System.out.println(c);
Parent p =new child();
p.m1();
//p.m4();
child f=(child) p;
f.m4()

	}

}
