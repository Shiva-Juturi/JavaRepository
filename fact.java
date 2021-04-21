import java.util.*;
class fact 
{	
	int result = 1;
	int m1(int n)
	{	
		if(n==1){
			return this.result;
		}else{
			this.result = this.result*n;
			n--;
			m1(n);	
		}
		return result;
	}

public static void main(String[] args) 
	{
	System.out.println("please enter number N  ");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
		fact t= new fact();
	
		int result = t.m1(n);
		System.out.println("Factorial"+result);

	}
}
