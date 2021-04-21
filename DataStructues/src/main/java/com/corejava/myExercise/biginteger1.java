package com.corejava.myExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class biginteger1 {

	void factorial1() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		BigInteger sum = BigInteger.valueOf(1L);
		BigInteger i;
		i = new BigInteger(n);
		if (i.compareTo(BigInteger.ZERO) == 1) {

			for (i = new BigInteger(n); i.compareTo(BigInteger.ZERO) == 1; i = i.subtract(BigInteger.ONE)) {

				sum = sum.multiply(i);
				System.out.println(" 1st value is Higher ====" + "i value " + i + " sum   " + (sum));
			}
		} else if (i.compareTo(BigInteger.ZERO) == -1) {

			System.out.println("  Second value is higher ==== entered values is - " + i);
		} else {

			System.out.println("i.compareTo(BigInteger.ZERO) == 0 " + " both are equal ==entered values is 0 " + i);
		}
	}
	
	void naturalnumner() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		BigInteger sum = BigInteger.valueOf(0L);
		BigInteger i;
			i = new BigInteger(n);
		if (i.compareTo(BigInteger.ZERO) == 1) {

			for (i = new BigInteger(n); i.compareTo(BigInteger.ZERO) == 1; i = i.subtract(BigInteger.ONE)) {

				sum = sum.add(i);
				System.out.println(" 1st value is Higher ====" + "i value " + i + " sum   " + (sum));
			}
		} else if (i.compareTo(BigInteger.ZERO) == -1) {

			System.out.println("  Second value is higher ==== entered values is - " + i);
		} else {

			System.out.println("i.compareTo(BigInteger.ZERO) == 0 " + " both are equal ==entered values is 0 " + i);
		}
	}


	public static void main(String[] args) {

		biginteger1 bg = new biginteger1();
		try {
			bg.factorial1();
			bg.naturalnumner();
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
