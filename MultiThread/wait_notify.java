package com.corejava.MultiThread;


public class wait_notify {
	
	public static void main(String[] args) {
		
		Q q =new Q();
		producer p=new producer(q);
		consumer c=new consumer(q);
		
		
	}

}
