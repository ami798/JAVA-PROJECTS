import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your grade: ");
        double grade = input.nextDouble();

        System.out.println("\n--- Student Summary ---");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Grade : " + grade);

        if (grade >= 90) {
            System.out.println("Status: Excellent! 🌟");
        } else if (grade >= 75) {
            System.out.println("Status: Good Job!");
        } else if (grade >= 60) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed 😢");
        }
    }
}
