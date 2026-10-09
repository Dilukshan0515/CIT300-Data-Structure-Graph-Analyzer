import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GraphModule graph = new GraphModule();

        int choice;

        do {
            System.out.println("\n====================================");
            System.out.println(" DATA STRUCTURE & GRAPH ANALYZER");
            System.out.println("====================================");
            System.out.println("1. Array Operations");
            System.out.println("2. Stack Operations");
            System.out.println("3. Queue Operations");
            System.out.println("4. Linked List Operations");
            System.out.println("5. Searching Operations");
            System.out.println("6. Graph Operations");
            System.out.println("7. Performance Comparison");
            System.out.println("8. Display All Results");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                choice = 0;
            }

            switch (choice) {
                case 1:
                    System.out.println("Array Operations selected.");
                    break;

                case 2:
                    System.out.println("Stack Operations selected.");
                    break;

                case 3:
                    System.out.println("Queue Operations selected.");
                    break;

                case 4:
                    System.out.println("Linked List Operations selected.");
                    break;

                case 5:
                    System.out.println("Searching Operations selected.");
                    break;

                case 6:
                    graph.menu(scanner);
                    break;

                case 7:
                    System.out.println("Performance comparison integration pending.");
                    break;

                case 8:
                    System.out.println("Display all results integration pending.");
                    break;

                case 9:
                    System.out.println("Thank you for using the analyzer!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 9);

        scanner.close();
    }
}
