package day3_Arrays;

import java.util.Scanner;

public class Dynamic3d {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of school:");
		int sch = sc.nextInt();
		
		//creating array
		int arr[][][] = new int[sch][][];
		//collecting class count
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the class count in school no"+(i+1));
			arr[i] = new int[sc.nextInt()][];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the student count in class no: "+(j+1));
				arr[i][j] = new int[sc.nextInt()];
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school no :"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Insdie class no :"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the marks for student :"+(k+1));
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school no :"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Insdie class no :"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("the marks for student no :"+(k+1)+" is "+arr[i][j][k]);
				}
			}
		}
		sc.close();
		
	}

}
