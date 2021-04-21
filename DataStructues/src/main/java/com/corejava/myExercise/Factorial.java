package com.corejava.myExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Factorial {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter Number ");
		String n = br.readLine();
		BigInteger sum = new BigInteger("1");
		for (BigInteger i = new BigInteger(n); i.compareTo(BigInteger.ONE)==1;i= i.subtract(new BigInteger("1"))) 
		{
			sum = sum.multiply(i);
		}
		System.out.println("Sum Of " + sum);
	}

}
