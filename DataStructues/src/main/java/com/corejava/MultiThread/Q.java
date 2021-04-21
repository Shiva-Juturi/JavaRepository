package com.corejava.MultiThread;

 public class Q {

	int num;
	boolean valueset = false;

	public synchronized void put(int num) {
		while (valueset) {
			try {
				wait();
			} catch (Exception e) {		}
		}
		System.out.println("put "+  num);
		this.num = num;
		valueset = true;
		notify();
	}
	
	public  synchronized void get() {
		while (!valueset) {
			try {
				wait();
			} catch (Exception e) {		}
		}
		System.out.println("get  "+  num);
		valueset = false;
		notify();
			}
	}
 
 class producer implements Runnable
 {
	 Q q;

	public producer(Q q) {
	
		this.q=q;
		Thread  t = new Thread(this,"producer");
		t.start();
	}
	@Override
	public void run() {
		 int i =0;
		 while (true)
		 {
			 q.put(i++);
			 try {
				 Thread.sleep(1000);
			 }catch (Exception e) {}
		 }
		
	}
	 
 }
 
 class consumer implements Runnable
 {
	 Q q;

	public consumer(Q q) {
	
		this.q = q;
		
		Thread  t = new Thread(this,"consumer");
		t.start();
	}

	public void run() {
		while (true) {
			q.get();
			try {
				 Thread.sleep(1000);
			 }catch (Exception e) {}
		}
	}
	
	}
		
		
	
