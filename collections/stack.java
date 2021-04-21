package com.corejava.collections;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stack {
public static void main(String[] args) throws IOException {
	
	Stack<Integer> st = new Stack<Integer>();
	int choice=0;
	int position, element;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	while (choice<5) {
		
		System.out.println("Stack Operation ");
		System.out.println("1  Push operation ");
		System.out.println("2 POP  Operation ");
		System.out.println("3 Search Element ");
		System.out.println("4 Top of the element ");
		System.out.println("5 EXIT ");
		
		choice =Integer.parseInt(br.readLine());
		
		switch(choice) {
		case 1:		System.out.println("Enter Element ");
					element = Integer.parseInt(br.readLine());
					st.push(element);
					break;		
					
		case 2: Integer out =st.pop();
				System.out.println("POPED Element"+ out);
				break;
		case 3:
				System.out.println("Which element you want Search");
				element =Integer.parseInt(br.readLine());
				position =st.search(element);
				
				if (position == -1) 
				System.out.println("element are not found");
				else System.out.println("position"+ position);
				break;
				
		case 4:
				System.out.println("find top of element");
				position =st.peek();
				System.out.println("Top of the element "+position);
				break;
			
		default :
				return;
	}
		System.out.println(st);
			

	}
		
}
}
