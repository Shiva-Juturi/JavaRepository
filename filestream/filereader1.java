package com.corejava.filestream;
import java.io.*;

 public class filereader1
	{
		public static void main(String[] args) throws IOException
		{
			//BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		//	String name=br.readLine();
					System.out.println("Please enter string");
					FileReader fw =new FileReader ("F:\\Java\\samba.txt");
					int ch;
					while ((ch=fw.read() )!= -1)
					System.out.print((char)ch);
					fw.close();

					}
	}



