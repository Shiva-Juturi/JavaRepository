package com.corejava.MultiThread;

import java.util.concurrent.TimeUnit;

public  class nalini  {

	 int a;
	 int b;

	synchronized  void add() {
		a = 10;
		b = 30;
		for (int i = 0; i < 5; i++) {
			//System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName()+"Addition    "+ "  "+i+ "   "+ (a + b));

			try {
				//Thread.sleep(5000); // main thread is going for sleep not My Thread
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) { // TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	  void sub() {

		int c = 50;
		int d = 20;
		for (int i = 0; i < 5; i++) {
		//	System.out.println(Thread.currentThread().getName());
			
			System.out.println(Thread.currentThread().getName()+"Substraction    "+i+ "  " +  (c - d));
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.getMessage();
			}

		}
	}

	
	
}