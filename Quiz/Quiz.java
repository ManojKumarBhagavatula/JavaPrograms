package day3_Arrays;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuizQuestions quiz = new QuizQuestions();
        int count = 0;

        int choice = 0;
        while (choice != 4) {
        	
        	if(count > 0) System.out.println("Welcome again !!");
        		
        	else System.out.println("Welcome to quiz !!");
        	System.out.println();
        	
        	quiz.displayItems();     

            choice = sc.nextInt();
            System.out.println();

            if (choice >= 1 && choice <= 3) {
            	count++;
                quiz.takeQuiz(choice);
                
            } else if (choice != 4) System.out.println("Invalid choice. Please select a valid option.");
        }

        sc.close();
        System.out.println("Thank you for participating in the quiz! 🙋‍♂️🙋‍♂️");
    }
}


