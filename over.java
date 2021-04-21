class over
{
private void m1(){

		System.out.println("over Partent class ");
	}
}
class child extends over 
{
	int a=20;
/*private void m1(){
	System.out.println("child overloading ");
}*/
int m5( int a){
	System.out.println("child overloading ");
	return a;
}

public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		//child c = new child();
		over v= new child();
		child g =(child) v;
		v.m1();
		int s=g.m5(10);
		System.out.println(s);
		v.m1();


	}
}
