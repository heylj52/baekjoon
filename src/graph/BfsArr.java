package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BfsArr {
	
	private int N;
	private int[][] graph;
	private boolean[] visit;

	public BfsArr(int N) {
		this.N = N;
		graph = new int[N+1][N+1];
		visit = new boolean[N+1];
	}
	
	public void putGraph(int from, int to) {
		graph[from][to] = graph[to][from] = 1;
	}
	
	public void bfs(int V) {
		Queue<Integer> queue = new LinkedList<Integer>();
		visit[V] = true;
		queue.offer(V);
		
		while(!queue.isEmpty()) {
			V = queue.poll();
			System.out.print(V+" ");
			for(int i=1; i<=N; i++) {
				if(graph[V][i]==1 && visit[i]==false) {
					visit[i] = true;
					queue.offer(i);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();
		BfsArr bfsArr = new BfsArr(N);
		for(int i=0; i<M; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			bfsArr.putGraph(from, to);
		}
		bfsArr.bfs(V);
	}
	
	
}
