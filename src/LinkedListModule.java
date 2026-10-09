import java.util.Scanner;

public class LinkedListModule {

	private static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node head;

	public LinkedListModule() {
		head = null;
	}

	// Insert a new node at the end
	public void insert(int value) {
		Node newNode = new Node(value);

		if (head == null) {
			head = newNode;
			return;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}

		current.next = newNode;
	}

	// Delete the first node matching the value
	public boolean delete(int value) {
		if (head == null) {
			return false;
		}

		if (head.data == value) {
			head = head.next;
			return true;
		}

		Node current = head;

		while (current.next != null) {
			if (current.next.data == value) {
				current.next = current.next.next;
				return true;
			}
			current = current.next;
		}

		return false;
	}

	// Search for a value and return its position
	public int search(int value) {
		Node current = head;
		int position = 0;

		while (current != null) {
			if (current.data == value) {
				return position;
			}
			current = current.next;
			position++;
		}

		return -1;
	}

	// Display the linked list
	public void display() {
		if (head == null) {
			System.out.println("Linked List is empty.");
			return;
		}

		Node current = head;
		System.out.print("Linked List: ");

		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}

		System.out.println("NULL");
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
			System.out.println("\n===== LINKED LIST OPERATIONS =====");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Search");
			System.out.println("4. Display");
			System.out.println("5. Return");

			int choice = readInt(sc, "Enter choice: ");

			switch (choice) {
				case 1:
					int insertValue = readInt(sc, "Enter value: ");
					insert(insertValue);
					System.out.println("Inserted successfully.");
					break;

				case 2:
					int deleteValue = readInt(sc, "Enter value to delete: ");
					System.out.println(delete(deleteValue)
							? "Deleted successfully."
							: "Value not found.");
					break;

				case 3:
					int searchValue = readInt(sc, "Enter value to search: ");
					int position = search(searchValue);
					System.out.println(position == -1
							? "Value not found."
							: "Value found at index: " + position);
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

