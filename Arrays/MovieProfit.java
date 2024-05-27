package day3_Arrays;

import java.util.Scanner;

public class MovieProfit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lang = sc.nextInt();
		int genere = sc.nextInt();
		int movies = sc.nextInt();
		int sum = 0;
		
		int profit[][][] = new int[lang][genere][movies];
		for (int i = 0; i < lang; i++) {
			for (int j = 0; j < genere; j++) {
				for (int j2 = 0; j2 < movies; j2++) {
					profit[i][j][j2] = i+5;
					sum += i+5;
				}				
			}			
		}
		
		System.out.println(sum>=5);
		
		sc.close();
		
	}

}
