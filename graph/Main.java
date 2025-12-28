// File: Main.java
public class Main {
    public static void main(String[] args) {

        GraphADT graph = new GraphADT(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        System.out.println("Graph:");
        graph.display();

        System.out.print("BFS from 0: ");
        graph.bfs(0); // 0 1 4 2 3

        System.out.print("DFS from 0: ");
        graph.dfs(0); // 0 1 2 3 4
    }
}
