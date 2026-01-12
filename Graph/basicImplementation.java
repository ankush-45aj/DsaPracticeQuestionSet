package Graph;

import java.util.ArrayList;

public class basicImplementation {
    public static class edge {
        int src;
        int dest;

        edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<edge> graphs[]) {
        for (int i = 0; i < graphs.length; i++) {
            graphs[i] = new ArrayList<>(); // initialize each index
        }
        graphs[0].add(new edge(0, 1));
        graphs[1].add(new edge(1, 2));
        graphs[1].add(new edge(1, 3));
        graphs[2].add(new edge(2, 1));
        graphs[2].add(new edge(2, 3));

        for (int i = 0; i < graphs.length; i++) {
            for (int j = 0; j < graphs[i].size(); j++) {
                System.out.print(graphs[i].get(j).dest + " ");
                System.out.println(graphs[i].get(j).src);
            }

        }
    }

    public static void main(String[] args) {
        // int[] graph = new int[5];
        int v = 5;
        ArrayList<edge> graphs[] = new ArrayList[v];
        createGraph(graphs);
    }
}
