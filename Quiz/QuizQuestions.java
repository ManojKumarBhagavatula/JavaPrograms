package day3_Arrays;

import java.util.Scanner;

class QuizQuestions {
    Scanner sc = new Scanner(System.in);

    int mathQuizQuestion() {
        int totalMathMarks = 7;

        String[] mathQuestions = new String[]{
            "What is 5 + 3?",
            "What is 12 - 4?",
            "What is 6 * 2?",
            "What is 16 / 4?",
            "What is 9 + 6?",
            "What is 15 - 5?",
            "What is 8 * 1?"
        };

        String[][] mathOptions = new String[][]{
            {"6", "7", "8", "9"},
            {"6", "8", "9", "10"},
            {"12", "11", "9", "13"},
            {"2", "3", "4", "5"},
            {"12", "14", "15", "16"},
            {"8", "9", "10", "11"},
            {"6", "7", "8", "9"}
        };

        int[] mathAnswers = new int[]{3, 2, 1, 3, 3, 3, 3}; 

        System.out.println("Answer the following Math Questions.......");
        System.out.println();
        for (int i = 0; i < mathQuestions.length; i++) {
            System.out.println(mathQuestions[i]);
            for (int j = 0; j < mathOptions[i].length; j++) {
                System.out.println((j + 1) + ". " + mathOptions[i][j]);
            }
            System.out.print("Your answer: ");
            int ans = sc.nextInt();
            System.out.println();
            if (mathAnswers[i] != ans) 
                totalMathMarks--;
        }
        return totalMathMarks;
    }

    int scienceQuizQuestions() {
        int totalScienceMarks = 7;

        String[] scienceQuestions = new String[]{
            "What planet is known as the Red Planet?",
            "What gas do plants absorb from the atmosphere?",
            "What is the boiling point of water in Celsius?",
            "What force keeps us on the ground?",
            "What is the chemical symbol for water?",
            "What part of the plant conducts photosynthesis?",
            "What is the largest planet in our solar system?"
        };

        String[][] scienceOptions = new String[][]{
            {"Venus", "Earth", "Mars", "Jupiter"},
            {"Oxygen", "Nitrogen", "Carbon Dioxide", "Hydrogen"},
            {"90", "100", "110", "120"},
            {"Magnetism", "Electricity", "Gravity", "Friction"},
            {"H2O", "O2", "CO2", "N2"},
            {"Roots", "Stem", "Leaves", "Flower"},
            {"Earth", "Mars", "Jupiter", "Saturn"}
        };

        int[] scienceAnswers = new int[]{2, 2, 1, 2, 0, 2, 2}; 

        System.out.println("Answer the following Science Questions.......");
        System.out.println();
        for (int i = 0; i < scienceQuestions.length; i++) {
            System.out.println(scienceQuestions[i]);
            for (int j = 0; j < scienceOptions[i].length; j++) {
                System.out.println(+(j + 1) + ". " + scienceOptions[i][j]);
            }
            System.out.print("Your answer: ");
            int ans = sc.nextInt();
            System.out.println();
            if (scienceAnswers[i] != ans) 
                totalScienceMarks--;
        }
        return totalScienceMarks;
    }

    int generalKnowledgeQuizQuestion() {
        int totalGKMarks = 7;

        String[] generalKnowledgeQuestions = new String[]{
            "What is the capital of France?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the largest ocean on Earth?",
            "Which country is known as the Land of the Rising Sun?",
            "Who was the first President of the United States?",
            "What is the tallest mountain in the world?",
            "What is the largest continent by area?"
        };

        String[][] generalKnowledgeOptions = new String[][]{
            {"Paris", "London", "Berlin", "Madrid"},
            {"William Shakespeare", "Charles Dickens", "Mark Twain", "Jane Austen"},
            {"Atlantic", "Indian", "Arctic", "Pacific"},
            {"China", "South Korea", "Japan", "Thailand"},
            {"Abraham Lincoln", "George Washington", "Thomas Jefferson", "John Adams"},
            {"K2", "Kangchenjunga", "Everest", "Lhotse"},
            {"Africa", "Asia", "Europe", "Antarctica"}
        };

        int[] generalKnowledgeAnswers = new int[]{0, 0, 3, 2, 1, 2, 1}; 

        System.out.println("Answer the following General Knowledge Questions.......");
        System.out.println();
        for (int i = 0; i < generalKnowledgeQuestions.length; i++) {
            System.out.println(generalKnowledgeQuestions[i]);
            for (int j = 0; j < generalKnowledgeOptions[i].length; j++) {
                System.out.println(+(j + 1) + ". " + generalKnowledgeOptions[i][j]);
            }
            System.out.print("Your answer: ");
            int ans = sc.nextInt();
            System.out.println();
            if (generalKnowledgeAnswers[i] != ans) 
                totalGKMarks--;
        }
        return totalGKMarks;
    }
    
    void displayItems() {
    	System.out.println("1 -> Math");
    	System.out.println("2 -> Science");
    	System.out.println("3 -> General Knowledge");
    	System.out.println("4 -> Exit");
    	System.out.print("Which test do you want to take? :");  
    }
    
    void takeQuiz(int choice) {
        switch (choice) {
            case 1:
                int mathResult = mathQuizQuestion();
                if(mathResult == 7)System.out.println("Congratulations! 🥳🥳 You got all the answers correct in Math!");
                else System.out.println("Your Math score: " + mathResult + " out of 7");
                System.out.println();                
                break;
                
            case 2:
                int scienceResult = scienceQuizQuestions();
                if(scienceResult == 7)System.out.println("Congratulations! 🥳🥳 You got all the answers correct in Science!");
                else System.out.println("Your Math score: " + scienceResult + " out of 7");
                System.out.println();
                break;
                
            case 3:
                int gkResult = generalKnowledgeQuizQuestion();
                if(gkResult == 7)System.out.println("Congratulations! 🥳🥳 You got all the answers correct in GK!");
                else System.out.println("Your Math score: " + gkResult + " out of 7");
                System.out.println();
                break;               
        }
    }
}

