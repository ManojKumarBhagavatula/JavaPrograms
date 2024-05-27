package day3_Arrays;

import java.util.Scanner;

public class DynamicMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int marks[][] = new int[3][];
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter size of students of class :"+(i+1));
			marks[i] = new int[sc.nextInt()];
			for (int j = 0; j < marks[i].length; j++) {
				marks[i][j] = i+72;		
			}				
		}
		sc.close();
		for (int i = 0; i < 3; i++) {		
			for (int j = 0; j < marks[i].length; j++) {
				System.out.print("Class "+(i+1)+" student"+(j+1)+" : "+marks[i][j] + " "+"\n");	
			}		
			System.out.println();
		}
	}

}
