package com.corejava.filestream;
import java.io.*;
public class fileoutput {
	
	
		public static void main(String[] args) throws IOException

		{
			DataInputStream  dis = new DataInputStream(System.in);
			FileOutputStream fout =new FileOutputStream("samba.txt", true);
			BufferedOutputStream bout =new BufferedOutputStream(fout,1024);
			char ch ;
			while ((ch=(char)dis.read()) !='@')
		
			bout.write(ch);
		
			bout.close();
		}
	}


