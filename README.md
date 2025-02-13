## Overview
This Java project implements a **graph-based word correction system** using **Dijkstra's algorithm** and a **hash table with chaining** for storing words. The program reads words from a file, stores them in a hash table, and allows users to input a word to check for possible corrections based on keyboard proximity.

## Features
- **Graph Implementation:** Represents the keyboard layout as a graph.
- **Dijkstra's Algorithm:** Finds the shortest path between letters.
- **Hash Table:** Uses chaining for efficient word storage and retrieval.
- **User Input Validation:** Ensures input contains only English characters.

## Project Structure

```
📦 Project
 ┣ 📜 Graph.java
 ┣ 📜 Node.java
 ┣ 📜 Main.java
 ┣ 📜 chainingHash.java
 ┣ 📜 words.txt
```

## Files Explanation

### `Graph.java`
- Implements a directed graph using an adjacency matrix.
- **Methods:**
  - `addNode(Node node)`: Adds a new node to the graph.
  - `addEdge(int src, int dst)`: Adds a directed edge between two nodes.
  - `dijkstra(int src, int target)`: Uses **Dijkstra's algorithm** to find the shortest path.
  - `calculateShortestPath(int[] predecessors, int src, int target)`: Reconstructs the shortest path.

### `Node.java`
- Represents a graph node.
- **Fields:**
  - `int data`: Stores the node value.

### `Main.java`
- Reads words from `words.txt` and stores them in a hash table.
- Asks the user to enter a word and checks for correctness.
- Uses the **chainingHash** class to manage word storage.

### `chainingHash.java`
- Implements a hash table with chaining to store words.
- **Methods:**
  - `initializeTable()`: Initializes the hash table.
  - `createKeyboardGraph()`: Creates a **graph representation of the keyboard** for correction purposes.

## How It Works
1. The **keyboard layout** is represented as a graph.
2. Words from `words.txt` are stored in a **hash table**.
3. The user enters a word.
4. The system checks if the word exists in the hash table.
5. If not found, the system suggests corrections based on **keyboard adjacency** (shortest path in the graph).

## Installation & Usage
1. Clone the repository:
   ```sh
   git clone https://github.com/Zubair1683/Spell-Checker
   ```
2. Compile the Java files:
   ```sh
   javac *.java
   ```
3. Run the program:
   ```sh
   java Main
   ```
4. Enter a word when prompted.

## Example Usage
```
Enter a word or a sentence: hillo
Did you mean: hello?
```

## Dependencies
- Java 8 or later

## Future Improvements
- Improve correction suggestions using **Levenshtein distance**.
- Implement a **GUI interface**.
- Extend the dictionary with more words.


