import java.util.Arrays;
import java.util.Scanner;

public class SearchModule {

    public static class SearchResult {
        public final int index;
        public final int steps;
        public final long timeNs;

        public SearchResult(int index, int steps, long timeNs) {
            this.index = index;
            this.steps = steps;
            this.timeNs = timeNs;
        }
    }

    public static SearchResult linearSearch(int[] arr, int target) {
        int steps = 0;
        long start = System.nanoTime();

        for (int i = 0; i < arr.length; i++) {
            steps++;

            if (arr[i] == target) {
                long elapsed = System.nanoTime() - start;
                return new SearchResult(i, steps, elapsed);
            }
        }

        return new SearchResult(-1, steps, System.nanoTime() - start);
    }

    public static SearchResult binarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return new SearchResult(-1, 0, 0);
        }

        int left = 0;
        int right = arr.length - 1;
        int steps = 0;
        long start = System.nanoTime();

        while (left <= right) {
            steps++;
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return new SearchResult(mid, steps, System.nanoTime() - start);
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new SearchResult(-1, steps, System.nanoTime() - start);
    }

    public static void compare(int[] original, int target) {
        if (original == null || original.length == 0) {
            System.out.println("Array is empty. Insert values first.");
            return;
        }

        int[] sorted = Arrays.copyOf(original, original.length);
        Arrays.sort(sorted);

        SearchResult linear = linearSearch(original, target);
        SearchResult binary = binarySearch(sorted, target);

        System.out.println("\n===== SEARCH COMPARISON =====");
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Sorted:   " + Arrays.toString(sorted));
        System.out.println("Target:   " + target);

        System.out.printf("%-18s %-10s %-12s %-12s%n",
                "Algorithm", "Index", "Steps", "Time (ns)");

        System.out.printf("%-18s %-10d %-12d %-12d%n",
                "Linear Search", linear.index,
                linear.steps, linear.timeNs);

        System.out.printf("%-18s %-10d %-12d %-12d%n",
                "Binary Search", binary.index,
                binary.steps, binary.timeNs);

        System.out.println("Note: Binary search index refers to sorted array.");
        System.out.println("Timing excludes sorting and may vary between runs.");
        System.out.println("Linear: O(n), Binary: O(log n).");
    }

    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);

            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    public static void menu(Scanner sc, ArrayModule array) {
        while (true) {
            System.out.println("\n===== SEARCHING OPERATIONS =====");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Compare Both Algorithms");
            System.out.println("4. Return to Main Menu");

            int choice = readInt(sc, "Enter choice: ");

            if (choice == 4) {
                return;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice.");
                continue;
            }

            int[] values = array.getValues();

            if (values.length == 0) {
                System.out.println("Array is empty. Insert values first.");
                continue;
            }

            int target = readInt(sc, "Enter target: ");

            if (choice == 1) {
                SearchResult result = linearSearch(values, target);
                printResult(result);
            } else if (choice == 2) {
                int[] sorted = Arrays.copyOf(values, values.length);
                Arrays.sort(sorted);
                System.out.println("Sorted: " + Arrays.toString(sorted));
                SearchResult result = binarySearch(sorted, target);
                printResult(result);
            } else {
                compare(values, target);
            }
        }
    }

    private static void printResult(SearchResult result) {
        if (result.index == -1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("Found at index: " + result.index);
        }

        System.out.println("Steps: " + result.steps);
        System.out.println("Time (ns): " + result.timeNs);
    }
}

