package com.corejava.MultiThread;

class mythread3 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Deamon  thread ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}

public class deamon {
	public static void main(String[] args) {
		mythread3 t = new mythread3();
		t.setDaemon(true);
		t.start();
		for (int i = 0; i < 2; i++) {
			System.out.println("main thread ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

}
