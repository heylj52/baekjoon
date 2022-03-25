package graph;

import java.util.Scanner;

public class DfsArr {
	
	private int N;
	private int[][] graph;
	private boolean[] visit;

	public DfsArr(int N) {
		this.N = N;
		graph = new int[N+1][N+1];
		visit = new boolean[N+1];
	}
	
	public void putGraph(int from, int to) {
		graph[from][to] = graph[to][from] = 1;
	}
	
	public void dfs(int V) {
		System.out.print(V+" ");
		visit[V] = true;
		for(int i=1; i<=N; i++) {
			if(graph[V][i]==1 && visit[i]==false) {
				dfs(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();
		DfsArr dfsArr = new DfsArr(N);
		for(int i=0; i<M; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			dfsArr.putGraph(from, to);
		}
		dfsArr.dfs(V);
	}
	
	
}
