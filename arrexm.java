class EMP1
{ int eid;
	String ename;
	EMP(int eid,String ename)
	{
this.eid=eid;
this.ename=ename;

	}
}


class test5
{
Public static void main(String {} args)
	{
	EMP1 e1 =new EMP1(111,"sambasiva");
	EMP1 e2 =new EMP1(222,"sambasiva2");
	EMP1 e3 =new EMP1(333,"sambasiva333");
EMP1 [] e = new EMP1[3];
e[0]=e1;
e[1]=e2;
e[3]=e3;
		for (EMP1 ss :e)
		{
	System.out.println(ss);
		}

}

}