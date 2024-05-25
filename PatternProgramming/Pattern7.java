package day2_Patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n; j++) {
				if(k<10) {
					System.out.print("0");
				}
				
				System.out.print(k + "\t");
				k++;
				
			}
			System.out.println();
			
		}
		sc.close();
	}

}
