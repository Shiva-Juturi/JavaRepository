package com.corejava.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class IODemoByteStrem {

	static String inFileStr = "./src/main/resources/image1.jpg";

	static String outFileStr = "./src/main/resources/phone-out.jpg";

	public static void fileCopyNoBuffer() {

		System.out.println("\n file copy without Buffer ");
		File file = new File(inFileStr);
		System.out.println("fileSize  " + file.length() + "  ");

		long startTime, elapseTime;

		try (FileInputStream fin = new FileInputStream(inFileStr);
				FileOutputStream fout = new FileOutputStream(outFileStr)) {

			startTime = System.nanoTime();
			int bytesRead;

			while ((bytesRead = fin.read()) != -1) {

				fout.write(bytesRead);

			}
			System.out.println("  Fout " + outFileStr);
			System.out.println("  Fin  " + inFileStr);

			elapseTime = System.nanoTime() - startTime;

			System.out
					.println(" Total Elapsed Time in fileCopyNoBuffer " + (elapseTime / 1000000.0) + " Mille seconds ");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//	public static void fileCopyWithBuffer() {
//
//		long startTime, elapseTime;
//
//		System.out.println(" \n  fileCopyWithBuffer ");
//
//		
//		startTime = System.nanoTime();
//		try (BufferedInputStream bfin = new BufferedInputStream(new FileInputStream(inFileStr));
//				BufferedOutputStream Bfout = new BufferedOutputStream(new FileOutputStream(outFileStr))) {
//			
//			byte[] byteBuf= new byte[4000];
//			int numOfBytesRead;
//			
//			while(( numOfBytesRead = bfin.read())!=-1) {
//				
//				Bfout.write(numOfBytesRead);
//								
//				
//				
//			}
//			
//			elapseTime=System.nanoTime()-startTime;
//			
//			System.out.println(" Total Elapsed Time in fileCopyWithBuffer  "+ (elapseTime/1000000.0)+ " Mille seconds ");
//			
//			
//
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

	public static void fileCopyWithBuffer() {

		long startTime, elaspseTime;

		try (BufferedInputStream fin = new BufferedInputStream(new FileInputStream(inFileStr));
				BufferedOutputStream fout = new BufferedOutputStream(new FileOutputStream(outFileStr))) {

			startTime = System.nanoTime();

		//	byte[] byteCpy = new byte[4000];
			int numberOfcount;

			while ((numberOfcount = fin.read()) != -1) {

				fout.write(numberOfcount);

			}

			elaspseTime = System.nanoTime() - startTime;

			System.out.println("  elaspseTime" + (elaspseTime / 1000000) + " Millisec");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public static void main(String[] args) {

 // fileCopyNoBuffer();
	fileCopyWithBuffer();

	}

}
