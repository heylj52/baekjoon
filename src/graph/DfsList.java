package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DfsList {
	
	private int N;
	private ArrayList<ArrayList<Integer>> graph;
	private boolean[] visit;

	public DfsList(int N) {
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
	
	public void dfs(int V) {
		System.out.print(V+" ");
		visit[V] = true;
		for(int i : graph.get(V)) {
			if(visit[i]==false) {
				dfs(i);
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
		DfsList dfsList = new DfsList(N);
		for(int i=0; i<M; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			dfsList.putGraph(from, to);
		}
		dfsList.sort();
		dfsList.dfs(V);
	}
	
	
}
