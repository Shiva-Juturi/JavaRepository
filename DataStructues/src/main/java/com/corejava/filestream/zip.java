package com.corejava.filestream;

import java.io.*;
import java.util.zip.*;

public class zip {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("newzip");
		FileOutputStream fos = new FileOutputStream("unzip.txt");
		// InflaterOutputStream dos =new InflaterOutputStream(fos);
		InflaterInputStream iis = new InflaterInputStream(fin);
		int ch;
		while ((ch = iis.read()) != -1)
			fos.write(ch);
		fin.close();
		fos.close();

	}
}
