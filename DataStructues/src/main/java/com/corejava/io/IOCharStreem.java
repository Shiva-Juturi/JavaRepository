package com.corejava.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class IOCharStreem {

	static String outPutFile = "./src/main/resources/FileoutputData";
	 static File f1= new File("./src/main/resources/FileoutputData") ;

	public static void readFromStandedData() {

		System.out.println("  Enter to start continiue ");
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outPutFile)))

		) {

			String data;
			System.out.println(" \n dont enter to start ");

			while ((data = br.readLine()) != null && !data.equals("start")) {
				bw.append(data).append("\n");
				System.out.println(" \n dont enter to start ");

			}

			System.out.println("outPutFile" + outPutFile);

			System.out.println("data" + data);

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void scannerMathod() {

		Scanner scanner = new Scanner(System.in);
		String data = null;

//		System.out.println("scanner   Next Line " + scanner.nextLine());
		
		System.out.println("  Enter some text ");

		while (!(scanner.nextLine().equals("start"))) {

			data = scanner.nextLine();
		}

		
		System.out.println(" Enter the number ");
	int 	count= scanner.nextInt();
		System.out.println("  data  " + data);
		System.out.println("  count  " + count);
		
		
		try {
			Scanner s1= new Scanner(f1);
			while(s1.hasNext()) {
				
				System.out.println(s1.next());
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
//		readFromStandedData();

		scannerMathod();
	}

}
