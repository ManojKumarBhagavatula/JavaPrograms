package day2_Patterns;

import java.util.Scanner;

public class BoxPattern {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the no : ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=2*n-1; i++) {
			for(int j = 1; j<=2*n-1; j++) {
				System.out.print(n - Math.min( Math.min( i-1, j-1 ), Math.min( 2*n-1-i, 2*n-1-j ) ) + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
