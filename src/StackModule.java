import java.util.Scanner;

public class StackModule {
	private final int[] stack;
	private int top;

	public StackModule(int capacity) {
		if (capacity <= 0) {
			throw new IllegalArgumentException("Capacity must be positive.");
		}
		stack = new int[capacity];
		top = -1;
	}

	// Add a value to the top of the stack
	public boolean push(int value) {
		if (top == stack.length - 1) {
			return false;
		}
		stack[++top] = value;
		return true;
	}

	// Remove and return the top value
	public Integer pop() {
		if (top == -1) {
			return null;
		}
		return stack[top--];
	}

	// Return the top value without removing it
	public Integer peek() {
		if (top == -1) {
			return null;
		}
		return stack[top];
	}

	public void display() {
		if (top == -1) {
			System.out.println("Stack is empty.");
			return;
		}

		System.out.println("Stack (Top to Bottom):");
		for (int i = top; i >= 0; i--) {
			System.out.println("| " + stack[i] + " |");
		}
	}

	private static int readInt(Scanner sc, String message) {
		while (true) {
			System.out.print(message);
			try {
				return Integer.parseInt(sc.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Enter an integer.");
			}
		}
	}

	public void menu(Scanner sc) {
		while (true) {
			System.out.println("\n===== STACK OPERATIONS =====");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Display");
			System.out.println("5. Return");

			int choice = readInt(sc, "Enter choice: ");

			switch (choice) {
				case 1:
					int value = readInt(sc, "Enter value: ");
					System.out.println(push(value)
							? "Pushed successfully."
							: "Stack overflow: Stack is full.");
					break;

				case 2:
					Integer removed = pop();
					System.out.println(removed == null
							? "Stack underflow: Stack is empty."
							: "Popped: " + removed);
					break;

				case 3:
					Integer current = peek();
					System.out.println(current == null
							? "Stack is empty."
							: "Top element: " + current);
					break;

				case 4:
					display();
					break;

				case 5:
					return;

				default:
					System.out.println("Invalid choice.");
			}
		}
	}
}

