package com.corejava.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileOperation {
	
	
	public static void main(String[] args) {
	
				   
		 
		      File myObj = new File("filename.txt");
		     
		      if (myObj.canRead()) {
		      
		        System.out.println("  file is can read " + myObj.getName() );
		      
		      }
		 
		 
		 
	}
}