package com.corejava.MultiThread;

public  class Inhertance_Syncronized_blocks_my_mine   {
	
public static void main(String[] args) {
	
	
	Runnable1 r1=new Runnable1();
	Runnable2  r2=new Runnable2();
	
	Thread t= new Thread(r1);
	Thread t1= new Thread(r2);
	t.setName("First Thread");
	t1.setName("second Thread");
	t.start();
	t1.start();

	
}	

}
