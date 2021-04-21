package com.corejava.MultiThread;
public class Mythread {
	public static void main(String[] args) {
		abc t = new abc();
	 t.start();
	 abc t1 = new abc();
	 t1.start();
	 abc t2 = new abc();
	 t2.start();
	 
	 System.out.println(t1.currentThread().getId());
	 System.out.println(" how many thread "+ ""+t.getName());
	 System.out.println(t);
	 System.out.println("Active Count "+t.activeCount());
	 
			//t.run();
	 		/*System.out.println(" how many thread "+ ""+t.getName());
		for (int j = 0; j < 10; j++)
			System.out.println("main calss User Thread ");  */
	}
}
class abc extends Thread {
	public void run() {
		//for (int i = 0; i < 10; i++)
		System.out.println("User Thread ");
	}
}