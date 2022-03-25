package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Graph {
	
	public int N;
	public ArrayList<ArrayList<Integer>> graph;
	public boolean[] visit;
	
	public Graph(int N) {
		this.N = N;
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<N+1; i++) {
			graph.add(new ArrayList<Integer>());
		}
		visit = new boolean[N+1];
	}
	
	public void put(int from, int to) {
		graph.get(from).add(to);
		graph.get(to).add(from);
	}
	
	public void sort() {
		for(int i=0; i<graph.size(); i++) {
			Collections.sort(graph.get(i));
		}
	}
	
}

class Dfs extends Graph {

	public Dfs(int N) {
		super(N);
	}
	
	public void dfs(int V) {
		System.out.print(V+" ");
		visit[V] = true;
		for(int i : graph.get(V)) {
			if(visit[i]==false) {
				dfs(i);
			}
		}
	}
	
}

class Bfs extends Graph {

	public Bfs(int N) {
		super(N);
	}
	
	public void bfs(int V) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(V);
		visit[V] = true;
		while(!queue.isEmpty()) {
			V = queue.poll();
			System.out.print(V+" ");
			for(int i : graph.get(V)) {
				if(visit[i]==false) {
					visit[i] = true;
					queue.offer(i);
				}
			}
		}
	}
	
}

public class N1260 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();
		Dfs dfsGraph = new Dfs(N);
		Bfs bfsGraph = new Bfs(N);
		for(int i=0; i<M; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			dfsGraph.put(from, to);
			bfsGraph.put(from, to);
		}
		dfsGraph.sort();
		bfsGraph.sort();
		dfsGraph.dfs(V);
		System.out.println();
		bfsGraph.bfs(V);
	}
}
