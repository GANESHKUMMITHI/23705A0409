import java.util.Arrays;

public class Main {
    public static void addEdge(int[][] mat, int i, int t) {
        mat[i][t] = 1;
        mat[t][i] = 1; // since it's an undirected graph
    }

    public static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int r = 4;
        int[][] mat = new int[r][r];
        addEdge(mat, 0, 1);
        addEdge(mat, 0, 2);
        addEdge(mat, 1, 2);
        addEdge(mat, 2, 3);

        System.out.println("Adjacency Matrix Representation:");
        displayMatrix(mat);
    }
}