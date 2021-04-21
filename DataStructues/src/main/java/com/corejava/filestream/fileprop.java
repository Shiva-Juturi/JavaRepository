package com.corejava.filestream;
import java.io.*;

public class fileprop {
	

		public static void main(String[] args) throws IOException
		{			
			String name =args[0];
			 File f = new File(name);
			 System.out.println("File Name "+f.getName());
			  System.out.println("file path"+f.getPath());
			   System.out.println("Absolute path "+ f.getAbsolutePath());
			    System.out.println("Parent"+f.getParent());
				 System.out.println("if file exixts"+f.exists());

				 if (f.exists())
				 {
				  System.out.println( "Is writable"+f.canWrite());
				   System.out.println("Is reable "+f.canRead());
				    System.out.println("IS A directory"+f.isDirectory());
					System.out.println("file sixe in bytes "+f.length());
				 }
		}
	

}
