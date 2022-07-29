package Lab03;
import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class Graph {
	
	ArrayList<ArrayList<Integer>> graph;
	static int V;
	
	Graph(int nodes){
		V = nodes;
		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i<V; i++) {
			graph.add(new ArrayList<Integer>());
			
		}
	}
	void addEdge(int v, int u) {
		graph.get(v).add(u);
	}
	
	void printGraph() {
		for (int i = 0; i<V; i++) {
			System.out.print(i);
			for (int x:graph.get(i)) 
				System.out.print(" -> "+ x);
				System.out.println();
		}
	}
	public static void main(String[] args) {
		
		
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
			g.printGraph();
					
	}
catch(Exception e) {
			
		}
	}


}
