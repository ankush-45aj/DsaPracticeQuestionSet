package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    public static class edge {
        int src;
        int dest;

        edge(int src, int dest) {
            this.src = src;
            this.dest = dest;

        }
    }

    public static void bsfImplementation(ArrayList<edge> graph[], int v) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[v];
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (vis[curr] == false) {
                System.out.print(curr + " ");
                vis[curr] = true;
            }
            for (int i = 0; i < graph[curr].size(); i++) {
                edge e = graph[curr].get(i);
                q.add(e.dest);
            }

        }

    }

    public static void main(String[] args) {
        int v = 10;
        ArrayList<edge> graph[] = new ArrayList[10];
        createGraph(graph);
        bsfImplementation(graph, v);
    }

    private static void createGraph(ArrayList<edge>[] graph) {
        // TODO Auto-generated method stub
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < 10; j++) {
                graph[i].add(new edge(i, j));
            }
        }
        // for (int i = 0; i < graph.length; i++) {
        // for (int j = 0; j < graph[i].size(); j++) {
        // edge e = graph[i].get(j);
        // System.out.println(e.src + " " + e.dest);
        // }

        // // throw new UnsupportedOperationException("Unimplemented method
        // // 'createGraph'");
        // }
    }
}
