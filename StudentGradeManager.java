import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> studentScores = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            studentNames.add(name);

            System.out.print("Enter score of " + name + ": ");
            int score = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer
            studentScores.add(score);
        }

        // Calculations
        int total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for (int score : studentScores) {
            total += score;
            if (score > highest) highest = score;
            if (score < lowest) lowest = score;
        }

        double average = (double) total / n;

        // Display summary report
        System.out.println("\n--- Summary Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println(studentNames.get(i) + " scored: " + studentScores.get(i));
        }

        System.out.printf("Average Score: %.2f\n", average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        scanner.close();
    }
}
