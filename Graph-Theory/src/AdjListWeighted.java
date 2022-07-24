import java.io.*;
import java.util.*;

class Edge {
    int u, v, w;
    Edg(int u, int v, int w) {
        this.u = u;
        this.v. = v;
        this.w = w;
    }
}

class Graph {
    static class Node {
        int val, weight;
        Node (int val, int weight) {
            this.val = val;
            this.weight = weight;
        }
    }
};

// adjList
List<List<Node>> adjList = new ArrayList<>();

public Graph(List<Edge> edges) {
    // malloc for adjlist
    for (int = 0; i < edges.size(); i++) {
        adjList.add(i, new ArrayLst<>());
    }

    for (Edge e : edges) {
        // alloc new node in adjList from (u, v)
        agjLast.get(e.u).add(new Node(e.v, e.w));
    }
}

public static void display(Graph graph) {
    int u_vertex = 0;
    int list_size = graph.adjList.
}
