package com.corejava.MultiThread;

class mythread2 extends Thread {
	public void run() {

		System.out.println("Hook Funcationally ");
	}

}

public class hookthread {
	public static void main(String[] args) {

		mythread2 t = new mythread2();
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(t);

		for (int i = 0; i < 10; i++) {
			System.out.println("main function ");

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.getMessage();
			}
			if (i == 5) {
				System.exit(0);
			}
		}
	}

}
