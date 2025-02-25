import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            totalMarks += scanner.nextInt();
        }

        double average = (double) totalMarks / numSubjects;
        String grade = (average >= 90) ? "A+" : (average >= 80) ? "A" : (average >= 70) ? "B" :
                       (average >= 60) ? "C" : (average >= 50) ? "D" : "F";

        System.out.println("\nTotal: " + totalMarks + " | Average: " + average + "% | Grade: " + grade);
        scanner.close();
    }
}