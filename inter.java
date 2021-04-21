interface inter
{ void m1();
void m2();
void m3();
int i=10;
}


abstract class  sambainter implements inter 
{	public void m1()
{ System.out.println("m1 method");}
	public void m2(){ System.out.println("m2 method");}
}
class rao extends sambainter
{
	public void m3(){ System.out.println("m3 method");}

	public static void main(String[] args) 
	{
		rao si= new rao();
		si.m1();
		si.m2();
		si.m3();
		System.out.println("Varaible :"+ i);
		System.out.println("Varaible :"+ si.i);
		inter itr =new rao();
		itr.m1();

	}
}
