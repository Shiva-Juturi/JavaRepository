class EMP1
{ int eid;
	String ename;
	EMP1(int eid,String ename)
	{
		this.eid=eid;
	this.ename=ename;
	}
}
 // MY PROGRAM
public class test5
{
public  static void main(String [] args)
	{
	EMP1 e1 =new EMP1(111,"sambasiva");
	EMP1 e2 =new EMP1(222,"sambasiva2");
	EMP1 e3 =new EMP1(333,"sambasiva333");
		EMP1 [] e = new EMP1[5];
		e[0]=e1;
		e[2]=e2;
		e[4]=e3;
	for (EMP1 ss :e)
		{
	System.out.println(ss.eid+ "  "+ ss.ename );
		}

}

}