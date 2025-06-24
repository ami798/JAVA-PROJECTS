import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> tasks = new ArrayList<>();

        boolean running = true;

        while (running) {

            System.out.println("\n TO-DO LIST  ");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1–4): ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:

                    System.out.print("Enter your task: ");
                    String task = input.nextLine();
                    tasks.add(task);
                    System.out.println(" Task added successfully!");
                    break;

                case 2:

                    System.out.println("\n Your Tasks ");
                    if (tasks.isEmpty()) {
                        System.out.println(" No tasks found");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter the task number to remove: ");
                    int taskNumber = input.nextInt();
                    input.nextLine();

                    if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                        String removed = tasks.remove(taskNumber - 1);
                        System.out.println(" Removed: " + removed);
                    } else {
                        System.out.println(" Invalid task number.");
                    }
                    break;

                case 4:

                    System.out.println(" Exiting ");
                    running = false;
                    break;

                default:

                    System.out.println(" Invalid choice. Please enter 1–4.");
                    break;
            }
        }

        input.close();
    }
}
