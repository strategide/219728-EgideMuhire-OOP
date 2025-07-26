package beginner;

import java.util.Scanner;

/**
 * Determine the main grade.
 * @author strategide
 */
public class GradeDeterminer {
    public static void main(String[] args) {
        // Variable declarations
        Scanner input = new Scanner(System.in);
        String fullName;
        String subject;
        float score;
        char grade;
        
        // Prompt the user to enter in their name
        System.out.print("Enter the student name: ");
        fullName = input.nextLine();
        
        // Prompt the user to enter in the subject.
        System.out.print("Enter the subject: ");
        subject = input.nextLine();
        
        // Prompt the user to enter in the grade
        System.out.print("Enter the score: ");
        score = input.nextFloat();
        
        // Determine the grade based on input score
        String format = "Student name: %s, subject: %s, score: %.2f, grade: %c";
        
        if (score >= 70) {
            grade = 'A';
            System.out.printf(format, fullName, subject, score, grade);
        } else if (score >= 60) {
            grade = 'B';
            System.out.printf(format, fullName, subject, score, grade);
        } else if (score >= 50) {
            grade = 'C';
            System.out.printf(format, fullName, subject, score, grade);
        } else if (score >= 40) {
            grade = 'D';
            System.out.printf(format, fullName, subject, score, grade);
        } else if (score >= 0) {
            grade = 'F';
            System.out.printf(format, fullName, subject, score, grade);
        } else {
            System.out.println("Invalid score input.");
        }                
    }
}
