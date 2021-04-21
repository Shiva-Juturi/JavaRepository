package com.corejava.AllExamples;

public class check {
	void swap(employee e1, employee e2 ) {
		
		employee temp;
		temp=e1;
		e1=e2;
		e2=temp;
		System.out.println(" swap method employee  e1  "+e1+"swap method employee   e2 "+e2);
			
	}
	
void swap1 (employee e3) {
		
		int temp;
		temp=e3.id3;
		e3.id3=e3.id4;
		e3.id4=temp;
		
	}

}
