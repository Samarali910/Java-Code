package Bit_manipulation;

import java.util.Scanner;

public class Odd_Even {
	public static void main(String[] args) {
		System.out.println("Enter the no");
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.println(isodd(n));
	}

	 static boolean isodd(int x) {
		 
		return (x&1)==0;
	}

}
