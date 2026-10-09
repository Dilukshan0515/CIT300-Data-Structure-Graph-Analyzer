
# Data Structure & Graph Performance Analyzer

### CIT300 – Data Structures and Algorithms
**Graded Practical Assignment 2 – Week 12**

**Programming Language:** Java  
**Application Type:** Console-Based Application  
**Development Environment:** Visual Studio Code  
**Version Control:** Git and GitHub  

---

## 1. Project Description

The Data Structure & Graph Performance Analyzer is a Java-based console application developed as part of the CIT300 Data Structures and Algorithms module.

The main objective of this project is to demonstrate the practical implementation of fundamental data structures, searching algorithms, graph traversal techniques, and algorithmic complexity.

The system provides a menu-driven interface that allows users to perform different operations on arrays, stacks, queues, linked lists, and graphs.

It also includes searching techniques such as Linear Search and Binary Search, together with Breadth-First Search (BFS) and Depth-First Search (DFS) for graph traversal.

The project is designed to help users understand how different data structures work, how algorithms process information, and how their performance can be evaluated through operation counts, execution time, and complexity analysis.

This project was developed collaboratively by four group members using Java, object-oriented programming principles, Git, and GitHub.

---

## 2. Project Objectives

The main objectives of this project are:

- Implement fundamental data structures using Java.
- Demonstrate insertion, deletion, searching, and display operations.
- Implement Stack operations using the LIFO principle.
- Implement Queue operations using the FIFO principle.
- Demonstrate Linked List operations using dynamically connected nodes.
- Implement Linear Search and Binary Search algorithms.
- Represent graphs using an adjacency list.
- Implement BFS and DFS graph traversal algorithms.
- Demonstrate algorithm performance and complexity.
- Develop an integrated menu-driven console application.
- Apply input validation and error handling.
- Practice collaborative software development using GitHub.

---

## 3. Team Members and Individual Contributions

The project was developed by four members. Each member was assigned specific responsibilities to ensure fair task distribution and individual participation.

### Member 1 – Array and Searching Implementation

**Student Name:** M. R. Chamodi Dulanjanli  
**Student ID:** 23DA2-0644  
**Assigned Responsibility:** Array Operations and Searching Algorithms  
**GitHub Branch:** `feature/array-search`

#### Individual Contributions

- Developed the Array module using Java.
- Implemented array insertion operations.
- Implemented array deletion operations.
- Implemented array searching functionality.
- Implemented array display operations.
- Developed the Linear Search algorithm.
- Developed the Binary Search algorithm.
- Implemented search-result reporting.
- Worked on search operation counting and comparison.
- Added input validation for array and searching operations.
- Created and tested the Array and Searching modules.
- Contributed `ArrayModule.java` and `SearchModule.java`.
- Prepared `Member1Test.java` for individual module testing.

#### Main Responsibilities

The Array module allows users to manage a collection of elements using basic array operations.

The Searching module demonstrates how Linear Search and Binary Search locate elements using different approaches.

Linear Search examines elements sequentially, while Binary Search repeatedly reduces the search range in a sorted collection.

#### Related Files

- `src/ArrayModule.java`
- `src/SearchModule.java`
- `src/Member1Test.java`

---

### Member 2 – Stack and Queue Implementation

**Student Name:** D. M. K. Sewmini Disanayaka  
**Student ID:** 23DA2-0966  
**Assigned Responsibility:** Stack and Queue Operations  
**GitHub Branch:** `feature/stack-queue`

#### Individual Contributions

- Developed the Stack module using Java.
- Implemented Stack Push operations.
- Implemented Stack Pop operations.
- Implemented Stack Peek operations.
- Implemented Stack display functionality.
- Developed the Queue module using Java.
- Implemented Queue Enqueue operations.
- Implemented Queue Dequeue operations.
- Implemented Queue Front/Peek operations.
- Implemented Queue display functionality.
- Applied the Last In, First Out (LIFO) principle to Stack operations.
- Applied the First In, First Out (FIFO) principle to Queue operations.
- Worked on handling empty Stack and Queue conditions.
- Tested Stack and Queue functionality.
- Prepared `Member2Test.java` for individual module testing.

#### Main Responsibilities

The Stack module demonstrates how elements are inserted and removed according to the LIFO principle.

The Queue module demonstrates how elements are inserted and removed according to the FIFO principle.

Both modules help users understand how different data structures manage data in different processing orders.

#### Related Files

- `src/StackModule.java`
- `src/QueueModule.java`
- `src/Member2Test.java`

---

### Member 3 – Linked List Implementation

**Student Name:** Ahamed Asri  
**Student ID:** 23DA2-0735  
**Assigned Responsibility:** Linked List Operations  
**GitHub Branch:** `feature/linked-list`

#### Individual Contributions

- Developed the Linked List module using Java.
- Implemented a singly linked list data structure.
- Created node-based data storage.
- Implemented insertion operations.
- Implemented deletion operations.
- Implemented searching functionality.
- Implemented Linked List display and traversal operations.
- Worked on insertion at different positions.
- Worked on deletion by value or position.
- Implemented search step counting.
- Handled appropriate empty-list conditions.
- Tested Linked List operations.
- Prepared `Member3Test.java` for individual module testing.

#### Main Responsibilities

The Linked List module demonstrates how elements can be stored dynamically using connected nodes.

Unlike arrays, linked lists do not require elements to be stored in consecutive memory locations.

The module demonstrates node creation, insertion, deletion, searching, and traversal.

#### Related Files

- `src/LinkedListModule.java`
- `src/Member3Test.java`

---

### Member 4 – Graph Implementation, Main Integration and Documentation

**Student Name:** A. Dilukshan  
**Student ID:** 23DA2-0601  
**Assigned Responsibility:** Graph Operations, Main Menu Integration, Performance Comparison, Testing Coordination and Documentation  
**GitHub Branch:** `feature/graph-integration`

#### Individual Contributions

- Developed the Graph module using Java.
- Implemented graph representation using an adjacency list.
- Implemented vertex insertion.
- Implemented edge creation between vertices.
- Implemented graph display functionality.
- Implemented Breadth-First Search (BFS).
- Implemented Depth-First Search (DFS).
- Used graph traversal concepts to explore connected vertices.
- Developed the main console menu structure.
- Worked on connecting the individual modules into one application.
- Coordinated integration of Array, Stack, Queue, Linked List, Searching, and Graph components.
- Worked on the performance comparison and results presentation requirements.
- Coordinated compilation and integration testing.
- Managed the GitHub repository and integration branch.
- Prepared the project README documentation.
- Coordinated the group demonstration and final submission preparation.

#### Main Responsibilities

The Graph module demonstrates the representation and traversal of graphs.

An adjacency list is used to store connections between vertices.

BFS explores vertices level by level, while DFS explores connected paths deeply before backtracking.

The Main module provides the central menu through which users can access the different data structure and algorithm modules.

Member 4 is also responsible for coordinating the final integration and documentation of the project.

#### Related Files

- `src/GraphModule.java`
- `src/Main.java`
- `README.md`

---

## 4. Technologies Used

| Technology | Purpose |
|------------|---------|
| Java | Core application development |
| Java Development Kit (JDK) | Compiling and running Java programs |
| Visual Studio Code | Source code editing and development |
| Git | Version control |
| GitHub | Repository hosting and team collaboration |
| PowerShell / Terminal | Compiling, testing, and executing the application |
| Object-Oriented Programming | Modular class-based application design |

---

## 5. Main System Features

### 5.1 Array Operations

The Array module provides operations such as:

- Insert an element.
- Delete an element.
- Search for an element.
- Display array elements.

### 5.2 Stack Operations

The Stack module demonstrates the LIFO principle.

Operations include:

- Push
- Pop
- Peek
- Display

### 5.3 Queue Operations

The Queue module demonstrates the FIFO principle.

Operations include:

- Enqueue
- Dequeue
- Peek / Front
- Display

### 5.4 Linked List Operations

The Linked List module demonstrates node-based dynamic data storage.

Operations include:

- Insert
- Delete
- Search
- Display

### 5.5 Searching Operations

The Searching module demonstrates:

- Linear Search
- Binary Search
- Search results
- Search step comparison

### 5.6 Graph Operations

The Graph module uses an adjacency list representation.

Operations include:

- Add Vertex
- Add Edge
- Display Graph
- BFS Traversal
- DFS Traversal

### 5.7 Performance Comparison

The project includes a performance comparison requirement to help users understand differences between algorithms.

The intended comparison covers:

- Number of operations or steps
- Searching performance
- Graph traversal performance
- Algorithmic time complexity
- Execution time, where implemented

### 5.8 Display All Results

The integrated application includes a menu option intended to display available operation and performance results.

The final behavior of this option depends on the completed integration.

---

## 6. Main Menu Structure

The application is designed around the following menu:

```text
=============================================
     DATA STRUCTURE & GRAPH ANALYZER
=============================================

1. Array Operations
2. Stack Operations
3. Queue Operations
4. Linked List Operations
5. Searching Operations
6. Graph Operations
7. Performance Comparison
8. Display All Results
9. Exit

Enter your choice:
```

Each component should provide an appropriate submenu for performing its operations.

---

## 7. Project Folder Structure

```text
CIT300-Data-Structure-Graph-Analyzer/
|
|-- src/
|   |-- Main.java
|   |-- ArrayModule.java
|   |-- SearchModule.java
|   |-- StackModule.java
|   |-- QueueModule.java
|   |-- LinkedListModule.java
|   |-- GraphModule.java
|   |-- Member1Test.java
|   |-- Member2Test.java
|   |-- Member3Test.java
|
|-- README.md
```

The `bin/` directory can be generated during compilation to store compiled Java class files.

---

## 8. Instructions for Running the Program

### Prerequisites

Before running the application, make sure the following software is installed:

- Java Development Kit (JDK)
- Visual Studio Code or another Java-compatible development environment
- Git, if cloning the repository

### Step 1 – Clone the Repository

Open a terminal and run:

```bash
git clone https://github.com/Dilukshan0515/CIT300-Data-Structure-Graph-Analyzer.git
```

### Step 2 – Open the Project Directory

```bash
cd CIT300-Data-Structure-Graph-Analyzer
```

### Step 3 – Compile the Java Files

Create the output directory if it does not already exist.

For Windows PowerShell:

```powershell
New-Item -ItemType Directory -Force bin
javac -d bin src/*.java
```

### Step 4 – Run the Application

```bash
java -cp bin Main
```

### Step 5 – Use the Main Menu

After launching the program:

1. Select the required data structure or algorithm.
2. Enter the requested values.
3. Perform the available operations.
4. Observe the results.
5. Return to the main menu to explore other components.
6. Select Exit to close the application.

---

## 9. Algorithm Complexity Analysis

The following table presents the expected theoretical time complexity of common operations.

| Data Structure / Algorithm | Operation | Time Complexity |
|----------------------------|-----------|-----------------|
| Array | Access by index | O(1) |
| Array | Linear search | O(n) |
| Array | Insert with shifting | O(n) |
| Array | Delete with shifting | O(n) |
| Stack | Push | O(1) |
| Stack | Pop | O(1) |
| Stack | Peek | O(1) |
| Queue | Enqueue | O(1)* |
| Queue | Dequeue | O(1)* |
| Linked List | Search | O(n) |
| Linked List | Insert at beginning | O(1) |
| Linked List | Delete by value | O(n) |
| Linear Search | Search | O(n) |
| Binary Search | Search | O(log n) |
| BFS | Graph traversal | O(V + E) |
| DFS | Graph traversal | O(V + E) |

*Constant-time queue operations assume an appropriate queue implementation. Actual complexity depends on the underlying code.*

**Notes:**

- `n` represents the number of elements.
- `V` represents the number of vertices.
- `E` represents the number of edges.
- Binary Search requires sorted data.
- BFS and DFS complexities assume an adjacency list representation.

---

## 10. Testing and Validation

Testing is an important part of ensuring that the application behaves correctly.

### 10.1 Array Testing

- Insert elements.
- Delete existing elements.
- Search for existing and missing elements.
- Display the current array.
- Check invalid input handling.

### 10.2 Stack Testing

- Push multiple elements.
- Pop elements.
- Peek at the top element.
- Display Stack contents.
- Attempt to pop from an empty Stack.

### 10.3 Queue Testing

- Enqueue multiple elements.
- Dequeue elements.
- View the front element.
- Display Queue contents.
- Attempt to dequeue from an empty Queue.

### 10.4 Linked List Testing

- Insert nodes.
- Delete nodes.
- Search for existing and missing values.
- Display the Linked List.
- Check empty-list behavior.

### 10.5 Searching Testing

- Perform Linear Search.
- Perform Binary Search on sorted data.
- Search for existing elements.
- Search for missing elements.
- Compare search steps.

### 10.6 Graph Testing

- Add vertices.
- Add edges.
- Display the adjacency list.
- Execute BFS.
- Execute DFS.
- Test traversal from different starting vertices.
- Check invalid vertex input.

### 10.7 Integration Testing

- Verify the main menu.
- Verify navigation between submenus.
- Verify that each module is accessible.
- Verify Performance Comparison functionality.
- Verify Display All Results functionality.
- Verify invalid menu choice handling.
- Verify that the Exit option terminates the program correctly.

### Individual Test Files

The repository includes the following individual test files:

- `Member1Test.java`
- `Member2Test.java`
- `Member3Test.java`

These support testing of the corresponding members' modules.

**Testing Status:** Final integration testing and verification of all main-menu options should be completed before submission.

---

## 11. GitHub Collaboration

GitHub was used to support collaborative development and version control.

The project was divided into individual feature branches so members could work on their assigned components independently.

### Feature Branches

| Member | Branch | Responsibility |
|--------|--------|----------------|
| Member 1 | `feature/array-search` | Array and Searching |
| Member 2 | `feature/stack-queue` | Stack and Queue |
| Member 3 | `feature/linked-list` | Linked List |
| Member 4 | `feature/graph-integration` | Graph and Integration |

### Collaboration Workflow

1. Members worked on their assigned modules.
2. Changes were committed to their respective branches.
3. Individual modules were prepared for integration.
4. The group leader coordinated the main application.
5. Integrated functionality was compiled and tested.
6. The repository history provides evidence of development activity.

Commits, branches, and pull requests should be retained as evidence of genuine individual contribution.

### GitHub Repository

https://github.com/Dilukshan0515/CIT300-Data-Structure-Graph-Analyzer

---

## 12. Demonstration Video

The assignment requires one merged demonstration video showing the complete integrated system.

### Video Requirements

- Total duration must be less than 15 minutes.
- All four members must participate.
- Every member must introduce themselves.
- Every member must state their student ID.
- Every member must explain their assigned responsibility.
- Every member must show relevant code.
- Every member must demonstrate their functionality.
- Every member must explain the related data structure, algorithm, and complexity.
- Every member's face must be clearly visible throughout their respective presentation.

### Suggested Demonstration Order

**Member 1 – Chamodi**

- Array operations
- Linear Search
- Binary Search
- Search complexity

**Member 2 – Sewmini**

- Stack operations
- Queue operations
- LIFO and FIFO concepts

**Member 3 – Asri**

- Linked List operations
- Node structure
- Insertion, deletion, and searching

**Member 4 – Dilukshan**

- Graph representation
- Add Vertex and Add Edge
- BFS and DFS traversal
- Main menu integration
- Performance comparison
- GitHub collaboration and conclusion

---

## 13. Final Submission Checklist

Before final submission, verify the following:

- [ ] Array module works correctly.
- [ ] Stack module works correctly.
- [ ] Queue module works correctly.
- [ ] Linked List module works correctly.
- [ ] Searching module works correctly.
- [ ] Graph module works correctly.
- [ ] BFS and DFS work correctly.
- [ ] Performance Comparison is functional.
- [ ] Display All Results is functional.
- [ ] Main application integration is complete.
- [ ] Invalid inputs are handled appropriately.
- [ ] All modules compile successfully.
- [ ] All four members' details are correct.
- [ ] Individual contributions are documented.
- [ ] GitHub commits and branches are available.
- [ ] README documentation is complete.
- [ ] One merged demonstration video is prepared.
- [ ] Video duration is less than 15 minutes.
- [ ] Every member's face is visible during their presentation.
- [ ] Final files are submitted through the required LMS link.

If Google Drive submission is required because the project files are too large, follow the assignment's Google Drive sharing instructions and verify the required Editor permissions before submitting.

---

## 14. Conclusion

The Data Structure & Graph Performance Analyzer demonstrates the practical application of important data structures and algorithms using Java.

Through this project, the group gained experience in implementing arrays, stacks, queues, linked lists, searching algorithms, and graph traversal techniques.

The project also provides opportunities to examine algorithm performance, understand computational complexity, and practice input validation and object-oriented programming.

The development process encouraged teamwork, task distribution, version control, debugging, testing, and collaborative integration through GitHub.

The project serves as a practical learning application for understanding fundamental data structures and algorithms.

---

## 15. Project Contributors

| Student Name | Student ID | Contribution |
|--------------|------------|--------------|
| M. R. Chamodi Dulanjanli | 23DA2-0644 | Array and Searching |
| D. M. K. Sewmini Disanayaka | 23DA2-0966 | Stack and Queue |
| Ahamed Asri | 23DA2-0735 | Linked List |
| A. Dilukshan | 23DA2-0601 | Graph, Integration and Documentation |

**Module:** CIT300 – Data Structures and Algorithms  
**Assignment:** Graded Practical Assignment 2  
**Project:** Data Structure & Graph Performance Analyzer  
**Application:** Java Console-Based System
