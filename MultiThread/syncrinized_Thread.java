package com.corejava.MultiThread;


//class mythread4 implements Runnable {
//	nalini na =new nalini();
//	public void run() {
//		na.add();
//		na.sub();
//	}
//}
/*
class mythread5 extends Thread {
	public void run() {
		nalini.sub();
	}
}*/
public class syncrinized_Thread {
	public static void main(String[] args) {
		nalini na1 =new nalini();
		Runnable rn1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Add Method Called");
				na1.add();
				//na1.sub();
				
			}
		};
		Runnable rn2 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Subtraction  Method Called");
				na1.add();
				//na1.sub();
			}
		};
		Thread t = new Thread(rn1);
		t.setName("T Thread ");
		Thread t1 = new Thread(rn2);
		t1.setName("T111 Thread ");
		
		t.start();
		t1.start();
		
//		nalini obj = new nalini();
//		
//		mythread4 b= new mythread4(obj);
//		mythread4 a= new mythread4(obj);
//		b.setName("b thread");
//		a.setName("a thread");
//		b.start();
//		a.start();

		
		// new mythread5().start();

	}

}