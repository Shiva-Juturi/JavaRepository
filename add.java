import java.lang.*;
import java.util.*;
class hai 
{
	public int add (){

	System.out.println("Please enter number 1 :");
	 Scanner scan = new Scanner(System.in);
	 int a = scan.nextInt();
	 System.out.println("Please enter number 2 :");
	 Scanner new1 =new Scanner(System.in);
	 int b = new1.nextInt();
	 int  i = a+ b;
	 System.out.println("addition of two numbers new1 + scan  : "+i);
	 return i ;
	}
	public int minus (){
	System.out.println("Please enter number 1 :");
	 Scanner scan = new Scanner(System.in);
	 int a = scan.nextInt();
	 System.out.println("Please enter number 2 :");
	 Scanner new1 =new Scanner(System.in);
	 int b = new1.nextInt();
	 int i = a-b;
	 System.out.println("addition of two numbers new1 + scan  : "+i);
	 return i ;
	}

	 }



class samba 
{
	public static void main(String[] args) 
	{
		System.out.println("Om Namah sivaya");
		hai a = new hai();
		int result = a.add();
		int result1= a.minus();

		}
}
