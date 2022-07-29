package Lab03;

import java.io.*;
import java.util.*;

import Lab03.BFS.Graph;

public class DFS {
	static class Graph {
		private int V;

		private LinkedList<Integer> adj[];

		@SuppressWarnings("unchecked")
		Graph(int v) {
			V = v;
			adj = new LinkedList[v];
			for (int i = 0; i < v; ++i)
				adj[i] = new LinkedList();
		}

		void addEdge(int v, int w) {
			adj[v].add(w);
		}

		void DFSUtil(int v, boolean visited[]) {

			visited[v] = true;
			System.out.print(v + " ");

			Iterator<Integer> i = adj[v].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n])
					DFSUtil(n, visited);
			}
		}

		void DFS() {

			boolean visited[] = new boolean[V];

			for (int i = 1; i < V; ++i)
				if (visited[i] == false)
					DFSUtil(i, visited);
		}

		public static void main(String args[]) {
			try {
				File file = new File("/Users/arifin/eclipse-workspace/CSE 221/src/Lab03/graph.txt");
				Scanner in = new Scanner(file);
				int rows = in.nextInt();
				Graph g = new Graph(rows);
				int conn = in.nextInt();

				for (int i = 0; i < conn; i++) {
					int j = in.nextInt();
					int k = in.nextInt();
					g.addEdge(j, k);

				}
				g.DFS();
			} catch (Exception e) {

			}

		}
	}

}
