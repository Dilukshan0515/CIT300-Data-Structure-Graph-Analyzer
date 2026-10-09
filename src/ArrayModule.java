import java.util.Arrays;
import java.util.Scanner;

public class ArrayModule {
    private final int[] data;
    private int size;

    public ArrayModule(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive.");
        }
        data = new int[capacity];
        size = 0;
    }

    public boolean insert(int value) {
        if (size == data.length) {
            return false;
        }
        data[size++] = value;
        return true;
    }

    public boolean delete(int value) {
        int index = search(value);

        if (index == -1) {
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;
        return true;
    }

    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int[] getValues() {
        return Arrays.copyOf(data, size);
    }

    public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
        } else {
            System.out.println("Array: " + Arrays.toString(getValues()));
        }
    }

    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);

            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter an integer.");
            }
        }
    }

    public void menu(Scanner sc) {
        while (true) {
            System.out.println("\n===== ARRAY OPERATIONS =====");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");

            int choice = readInt(sc, "Enter choice: ");

            switch (choice) {
                case 1: {
                    int value = readInt(sc, "Enter value: ");
                    System.out.println(insert(value) ? "Inserted successfully." : "Array is full.");
                    break;
                }

                case 2: {
                    int value = readInt(sc, "Enter value to delete: ");
                    System.out.println(delete(value) ? "Deleted successfully." : "Value not found.");
                    break;
                }

                case 3: {
                    int value = readInt(sc, "Enter value to search: ");
                    int index = search(value);

                    if (index >= 0) {
                        System.out.println("Found at index: " + index);
                    } else {
                        System.out.println("Value not found.");
                    }
                    break;
                }

                case 4:
                    display();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid menu choice.");
            }
        }
    }
}

