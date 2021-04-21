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
class test5
{
 

public  static void main(String [] args)
	{
EMP1 []a =new EMP1[5];
	a[0]= new EMP1(11,"aa");
	a[1]= new EMP1(12,"aa");
	a[2]= new EMP1(13,"aa");
	a[3]= new EMP1(114,"aa");
	a[4]= new EMP1(115,"aa");

 for (int i=0;i <a.length ;i++ )
 { System.out.println (a[i].eid  + "            "+ a[i].ename);

 }

	}
}