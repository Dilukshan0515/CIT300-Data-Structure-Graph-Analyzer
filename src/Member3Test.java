import java.util.Scanner;

public class Member3Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedListModule list = new LinkedListModule();

        System.out.println("===== MEMBER 3 LINKED LIST TEST =====");
        list.menu(scanner);

        System.out.println("Testing completed.");
    }
}