import java.io.*;
import java.util.*;
class inputs 
{	
	public static void main(String[] args) throws IOException
	{
	BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
	System.out.print("Please Enter CHAR inputs:");
	char ch=(char)br.read();
	br.skip(2);

		System.out.println("Enater Name : aage  :  Salary ");
		String info =br.readLine();
		StringTokenizer st= new StringTokenizer(info," ");
		String s1=st.nextToken();
		String s2=st.nextToken();
		String s3=st.nextToken();

		s1=s1.trim();
		s2=s2.trim();
		s3=s3.trim();

	String name=s1;
	int age=Integer.parseInt(s2);
	float sal=Float.parseFloat(s3);
	System.out.println(name);
	System.out.println(age);
	System.out.println(sal);



	System.out.print("Please Enter 2nd CHAR inputs:");
	char hc=br.readLine().charAt(0);
	
	System.out.print("Please Enter Number inputs:");
	int i=Integer.parseInt(br.readLine());

	System.out.print("Please Enter Double inputs:");
	double d=Double.parseDouble(br.readLine());
		

	System.out.print("Please Enter String inputs:");
	String str=br.readLine();

	System.out.println(" String inputs:"+str);
	System.out.println("Char OutPut:"+ch);
	System.out.println("Char OutPut:"+hc);
	System.out.println("Int OutPut:"+i);
	System.out.println("Double OutPut:"+d);
	
	}
}
