public class AdjMatWeighted {
    public int adjMatWeighted[][];
    public int numVertices;
    // constructor
    public AdjMatWeighted(int numVertices) {
        this.numVertices = numVertices;
        adjMatWeighted = new int[numVertices][numVertices];
    }

    // edge
    public void addEdge(int i, int j, int w) {
        adjMatWeighted[i][j] = w;
        adjMatWeighted[j][i] = w;
    }

    // rm edge
    public void rmEdge(int i, int j) {
        adjMatWeighted[i][j] = 0;
        adjMatWeighted[j][i] = 0;
    }

    public void display() {
        for (int a = 0; a < adjMatWeighted.length; a++) {
            System.out.println();
            for (int b : adjMatWeighted[a]) {
                System.out.print(b + " ");
            }
        }
    }

    public static void main(String[] args) {
        AdjMatWeighted g_w = new AdjMatWeighted(5);

        g_w.addEdge(0, 1, 2);
        g_w.addEdge(0, 2, 3);

        g_w.addEdge(1, 3, 2);
        g_w.addEdge(1, 2, 15);

            g_w.addEdge(2, 4, 13);

        g_w.addEdge(3, 4, 9);

        g_w.display();
    }
}
