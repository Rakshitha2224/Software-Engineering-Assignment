import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Do you study Software Engineering? (yes/no): ");
        String answer = scan.nextLine().trim().toLowerCase();

        if (answer.equals("yes")) {
            System.out.println("Great choice! Software Engineering helps you learn coding and work on exciting projects.");
        } 
        else if (answer.equals("no")) {
            System.out.println("Why?? Without SE, you might miss opportunities to build coding skills, understand software design, and work on real-world projects.");
        } 
        else {
            System.out.println("Invalid input! Please enter 'yes' or 'no'.");
        }

        scan.close();
    }
}



