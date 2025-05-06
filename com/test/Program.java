package com.test;
import java.util.Scanner;
public class Program_01{
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		// Square of a number
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("Square of "+n+" is: "+(n*n));
	}
}
