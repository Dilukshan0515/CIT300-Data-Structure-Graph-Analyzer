import java.util.*;

public class GraphModule {

    private final Map<String, Set<String>> graph = new LinkedHashMap<>();

    public void addVertex(String vertex) {
        graph.putIfAbsent(vertex, new LinkedHashSet<>());
        System.out.println("Vertex added: " + vertex);
    }

    public void addEdge(String source, String destination) {
        if (!graph.containsKey(source) || !graph.containsKey(destination)) {
            System.out.println("Please add both vertices first.");
            return;
        }

        graph.get(source).add(destination);
        graph.get(destination).add(source);
        System.out.println("Edge added successfully.");
    }

    public void display() {
        System.out.println("\nGraph Adjacency List:");
        for (String vertex : graph.keySet()) {
            System.out.println(vertex + " -> " + graph.get(vertex));
        }
    }

    public void bfs(String start) {
        if (!graph.containsKey(start)) {
            System.out.println("Starting vertex not found.");
            return;
        }

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.print(current + " ");

            for (String neighbor : graph.get(current)) {
                if (visited.add(neighbor)) {
                    queue.add(neighbor);
                }
            }
        }

        System.out.println();
    }

    public void dfs(String start) {
        if (!graph.containsKey(start)) {
            System.out.println("Starting vertex not found.");
            return;
        }

        System.out.print("DFS Traversal: ");
        dfsRecursive(start, new HashSet<>());
        System.out.println();
    }

    private void dfsRecursive(String vertex, Set<String> visited) {
        visited.add(vertex);
        System.out.print(vertex + " ");

        for (String neighbor : graph.get(vertex)) {
            if (!visited.contains(neighbor)) {
                dfsRecursive(neighbor, visited);
            }
        }
    }

    public void menu(Scanner scanner) {
        int choice;

        do {
            System.out.println("\n===== GRAPH OPERATIONS =====");
            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. BFS Traversal");
            System.out.println("5. DFS Traversal");
            System.out.println("6. Back");
            System.out.print("Enter choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
                choice = 0;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter vertex: ");
                    addVertex(scanner.nextLine());
                    break;

                case 2:
                    System.out.print("Source vertex: ");
                    String source = scanner.nextLine();
                    System.out.print("Destination vertex: ");
                    String destination = scanner.nextLine();
                    addEdge(source, destination);
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.out.print("Starting vertex: ");
                    bfs(scanner.nextLine());
                    break;

                case 5:
                    System.out.print("Starting vertex: ");
                    dfs(scanner.nextLine());
                    break;

                case 6:
                    System.out.println("Returning to main menu...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);
    }
}
