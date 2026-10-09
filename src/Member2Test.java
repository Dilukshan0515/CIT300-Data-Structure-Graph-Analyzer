import java.util.Scanner;

public class Member2Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackModule stack = new StackModule(100);
        QueueModule queue = new QueueModule(100);

        while (true) {
            System.out.println("\n===== MEMBER 2 TEST MENU =====");
            System.out.println("1. Stack Operations");
            System.out.println("2. Queue Operations");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    stack.menu(scanner);
                    break;
                case "2":
                    queue.menu(scanner);
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}