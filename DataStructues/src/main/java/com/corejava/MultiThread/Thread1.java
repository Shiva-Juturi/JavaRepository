package com.corejava.MultiThread;

public class Thread1 {

	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(" Thread one");
				}
			}
		};
			
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(" Thread Two");
				}
			}
		};
		t.start();
	//	t.start(); java.lang.IllegalThreadStateException
		t1.start();
		//  t1.start();  java.lang.IllegalThreadStateException
	}

}
