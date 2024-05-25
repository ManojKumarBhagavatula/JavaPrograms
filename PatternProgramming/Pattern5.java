package day2_Patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n; j++) {
				System.out.print(i+1 + " ");
			}
			System.out.println();
			
		}
		sc.close();
	}

}
