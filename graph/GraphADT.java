// File: GraphADT.java
import java.util.*;

public class GraphADT {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    // Constructor
    public GraphADT(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge (undirected graph)
    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src);
    }

    // BFS (Breadth First Search)
    public void bfs(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adjList[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // DFS (Depth First Search)
    public void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        dfsRec(start, visited);
        System.out.println();
    }

    private void dfsRec(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adjList[node]) {
            if (!visited[neighbor]) {
                dfsRec(neighbor, visited);
            }
        }
    }

    // Display graph
    public void display() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int node : adjList[i]) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}
