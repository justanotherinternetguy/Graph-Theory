public class AdjMat {
    public boolean adjMat[][];
    public int numVertices;

    // constructor
    public AdjMat(int numVertices) {
        this.numVertices = numVertices;
        adjMat = new boolean[numVertices][numVertices];
    }

    // add edge
    public void addEdge(int i, int j) {
        adjMat[i][j] = true;
        adjMat[j][i] = true;
    }

    // rm edge
    public void rmEdge(int i, int j) {
        adjMat[i][j] = false;
        adjMat[j][i] = false;
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            sb.append(i + " : ");
            for (boolean j : adjMat[i]) {
                sb.append((j ? 1 : 0) + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        AdjMat g = new AdjMat(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);



        System.out.println(g.display());
    }
}
