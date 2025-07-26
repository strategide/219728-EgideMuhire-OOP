package beginner;

import java.util.Scanner;

/**
 * Using a switch case as a statement and expression.
 * 
 * @author strategide
 */
public class GradeDeterminerSwitchCase {
    public static void main(String[] args) {
                // Variable declarations
        Scanner input = new Scanner(System.in);
        String fullName;
        String subject;
        int score;
        char grade;
        
        // Prompt the user to enter in their name
        System.out.print("Enter the student name: ");
        fullName = input.nextLine();
        
        // Prompt the user to enter in the subject.
        System.out.print("Enter the subject: ");
        subject = input.nextLine();
        
        // Prompt the user to enter in the grade
        System.out.print("Enter the score: ");
        score = input.nextInt();
        
        // Determine the grade based on the switch grade
        String format = "Student name: %s, subject: %s, score: %.2f, grade: %c";
        
        switch(score / 10) {
            case 9, 8, 7 -> {
                grade = 'A';
            }
            case 6 -> {
                grade = 'B';
                
            }
            case 5 -> {
                grade = 'C';
                
            }
            case 4 -> {
                grade = 'D';
                
            }
            default -> {
                grade = 'A';
            }
        }
        
        System.out.println(grade);
        
        
    }
    
}
