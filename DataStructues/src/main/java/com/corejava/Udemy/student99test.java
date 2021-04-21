package com.corejava.Udemy;

public class student99test {
	public static void main(String[] args) {
		int[] array = new int[3];
		int index = 0;
		array[index++] = 10;
		array[index++] = 20;
		array[index++] = 30;

		student99 student1 = new student99(array[0], "Samnb");
		student1.Gender = "Male";

		student99 student2 = new student99(array[1], "juturi");
		student99 student3 = new student99(array[2], "nalini");
		System.out.println(student1);
		// System.out.println(student1.Name +" "+ student1.Gender +" " +student2.Name +"
		// "+ student3.Name );
		System.out.println(student2);
		System.out.println(student3);

		student1.UpdateDetails(array[0], "Sambasiva rao ");
		System.out.println(student1);
		System.out.println(student1.Name + student2.Name + student3.Name);

		System.out.println(student2.Name + "   ");
		System.out.println(student1.Name + "   ");

		student2 = student1;
		student1 = student3;

		System.out.println("student2.Name    " + student2.Name + "   ");
		System.out.println("student1.Name    " + student1.Name + "   ");
		System.out.println("student3.Name    " + student3.Name + "   ");

	}
}
