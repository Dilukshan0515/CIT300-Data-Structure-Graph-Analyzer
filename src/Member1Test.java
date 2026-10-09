import java.util.Scanner;

public class Member1Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayModule array = new ArrayModule(100);

        while (true) {
            System.out.println("\n===== MEMBER 1 TEST MENU =====");
            System.out.println("1. Array Operations");
            System.out.println("2. Searching Operations");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    array.menu(scanner);
                    break;

                case "2":
                    SearchModule.menu(scanner, array);
                    break;

                case "3":
                    System.out.println("Testing completed.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
