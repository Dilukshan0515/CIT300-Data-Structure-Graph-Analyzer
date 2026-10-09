import java.util.Scanner;

public class QueueModule {
	private final int[] queue;
	private int front;
	private int size;

	public QueueModule(int capacity) {
		if (capacity <= 0) {
			throw new IllegalArgumentException("Capacity must be positive.");
		}
		queue = new int[capacity];
		front = 0;
		size = 0;
	}

	public boolean enqueue(int value) {
		if (size == queue.length) {
			return false;
		}
		queue[(front + size) % queue.length] = value;
		size++;
		return true;
	}

	public Integer dequeue() {
		if (size == 0) {
			return null;
		}
		int value = queue[front];
		front = (front + 1) % queue.length;
		size--;
		return value;
	}

	public Integer peek() {
		return size == 0 ? null : queue[front];
	}

	public void display() {
		if (size == 0) {
			System.out.println("Queue is empty.");
			return;
		}

		System.out.println("Queue (Front to Rear):");
		for (int i = 0; i < size; i++) {
			System.out.println("| " + queue[(front + i) % queue.length] + " |");
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
			System.out.println("\n===== QUEUE OPERATIONS =====");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Peek");
			System.out.println("4. Display");
			System.out.println("5. Return");

			int choice = readInt(sc, "Enter choice: ");

			switch (choice) {
				case 1:
					int value = readInt(sc, "Enter value: ");
					System.out.println(enqueue(value)
							? "Enqueued successfully."
							: "Queue overflow: Queue is full.");
					break;
				case 2:
					Integer removed = dequeue();
					System.out.println(removed == null
							? "Queue underflow: Queue is empty."
							: "Dequeued: " + removed);
					break;
				case 3:
					Integer current = peek();
					System.out.println(current == null
							? "Queue is empty."
							: "Front element: " + current);
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

