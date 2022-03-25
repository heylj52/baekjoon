package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BfsList {
	
	private int N;
	private ArrayList<ArrayList<Integer>> graph;
	private boolean[] visit;

	public BfsList(int N) {
		this.N = N;
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<N+1; i++) {
			graph.add(new ArrayList<Integer>());
		}
		visit = new boolean[N+1];
	}
	
	public void putGraph(int from, int to) {
		graph.get(from).add(to);
		graph.get(to).add(from);
	}
	
	public void bfs(int V) {
		Queue<Integer> queue = new LinkedList<Integer>();
		visit[V] = true;
		queue.offer(V);
		
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
	
	public void sort() {
		for(int i=1; i<graph.size(); i++) {
			Collections.sort(graph.get(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();
		BfsList bfsList = new BfsList(N);
		for(int i=0; i<M; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			bfsList.putGraph(from, to);
		}
		bfsList.sort();
		bfsList.bfs(V);
	}
	
	
}
