package com.corejava.MultiThread;

import java.util.concurrent.TimeUnit;

public class volatile_M {

	private static volatile boolean stop;
    static int i=1;
	public static void main(String[] args) throws InterruptedException {

		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (!stop) {
					System.out.println("Inside Runnable "+ stop +"    "  + i++);
					System.out.println(Thread.currentThread().getName());
				}

			}
		}

		).start();

		TimeUnit.SECONDS.sleep(10);
		stop=true;
		System.out.println(Thread.currentThread().getName());
		System.out.println("Inside main "+ stop +"    "  + i++);
		
	}

}
