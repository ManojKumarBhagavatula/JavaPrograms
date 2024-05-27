package day3_Arrays;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 5;
		int marks[][] = new int[3][size];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < size; j++) {
				marks[i][j] = i+60;		
			}				
		}
		sc.close();
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Class "+(i+1)+" student"+(j+1)+" : "+marks[i][j] + " "+"\n");
            }
            System.out.println();
        }
	}

}
