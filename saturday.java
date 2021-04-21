import java.util.*;

class saturday 
{
	void m1(String a){
		if (a!=null){
		for (int i=0;i<a.length() ;i++ )
		{
			for(int j=0;j<=i;j++){
				//System.out.print("char +" + a.charAt(i));
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		saturday s= new saturday();
		Scanner scan=new Scanner(System.in);
		String x= scan.next();
		s.m1(x);
	}
}
