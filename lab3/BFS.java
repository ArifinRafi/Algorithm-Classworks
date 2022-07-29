package Lab03;

import java.io.*;
import java.util.*;

public class BFS {

	static class Graph {
		private int V;
		private LinkedList<Integer> adj[];

		Graph(int v) {
			V = v;
			adj = new LinkedList[v];
			for (int i = 0; i < v; ++i)
				adj[i] = new LinkedList();
		}

		void addEdge(int v, int w) {
			adj[v].add(w);
		}

		void BFS(int s) {

			boolean visited[] = new boolean[V];

			LinkedList<Integer> queue = new LinkedList<Integer>();

			visited[s] = true;
			queue.add(s);

			while (queue.size() != 0) {

				s = queue.poll();
				System.out.print(s + " ");

				Iterator<Integer> i = adj[s].listIterator();
				while (i.hasNext()) {
					int n = i.next();
					if (!visited[n]) {
						visited[n] = true;
						queue.add(n);
					}
				}
			}
		}

		public static void main(String args[]) {
			try {
				File file = new File("/Users/arifin/eclipse-workspace/CSE 221/src/Lab03/graph.txt");
				Scanner in = new Scanner(file);
				int rows = in.nextInt();
				Graph g = new Graph(rows);
				int conn = in.nextInt();
				
				for (int i = 0; i<conn; i++) {
						int j = in.nextInt();
						int k = in.nextInt();
					    g.addEdge(j,k);
				
				}
				g.BFS(2);
				
				
						
		}
	catch(Exception e) {
				
			}
		}
	}

}
