package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BfsGraph {
	
	public int N;
	public ArrayList<ArrayList<Integer>> graph;
	public boolean[] visit;
	public int cnt;
	
	public BfsGraph(int N) {
		this.N = N;
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<N+1; i++) {
			graph.add(new ArrayList<Integer>());
		}
		visit = new boolean[N+1];
		cnt = 0;
	}
	
	public void put(int u, int v) {
		graph.get(u).add(v);
		graph.get(v).add(u);
	}
	
	public void bfs(int V) {
		cnt++;
		visit[V] = true;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(V);
		while(!queue.isEmpty()) {
			V = queue.poll();
			for(int i : graph.get(V)) {
				if(visit[i] == false) {
					queue.offer(i);
					visit[i] = true;
				}
			}
		}
	}
	
	public void sort() {
		for(int i=0; i<N+1; i++) {
			Collections.sort(graph.get(i));
		}
	}
	
	public boolean check(int V) {
		return visit[V];
	}
	
	public void getCnt() {
		System.out.println(cnt);
	}
}
public class N11724 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		BfsGraph bfsGraph = new BfsGraph(N);
		for(int i=0; i<M; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			bfsGraph.put(u, v);
		}
		bfsGraph.sort();
		for(int i=1; i<N+1; i++) {
			if(bfsGraph.check(i)==false) {
				bfsGraph.bfs(i);
			}
		}
		bfsGraph.getCnt();
	}
	
}
