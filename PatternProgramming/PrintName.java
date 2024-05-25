package day2_Patterns;

import java.util.Scanner;

public class PrintName extends CharPatterns{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name : ");
		String name = sc.nextLine().toUpperCase();
		sc.close();
		System.out.println();
		printName(name);
		

	}

}
