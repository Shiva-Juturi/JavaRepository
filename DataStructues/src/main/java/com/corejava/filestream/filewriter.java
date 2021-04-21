package com.corejava.filestream;
import java.io.*;

	

public class filewriter {

		public static void main(String[] args) throws IOException 
		{
			//BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		//	String name=br.readLine();
		int ch;
			FileWriter fw =new FileWriter ("F:\\Java\\readiptoopfile.doc",true);
					FileReader fr1 =new FileReader ("F:\\Java\\samba.txt");
					while ((ch=fr1.read() )!= -1)
					fw.write((char)ch);
					fr1.close();
					fw.close();
				
		}
	}


