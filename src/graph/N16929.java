package graph;

import java.util.Scanner;

public class N16929 {
	
	public static int[] dx = {-1, 1, 0, 0};
	public static int[] dy = {0, 0, -1, 1};
	
	public static void dfs(char[][] graph, int i, int j, int N, int M, boolean[][] visit) {
		char word = graph[i][j];
		visit[i][j] = true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		char[][] graph = new char[N][M];
		for(int i=0; i<N; i++) {
			String str = sc.nextLine();
			for(int j=0; j<M; j++) {
				graph[i][j] = str.charAt(j);
			}
		}
		boolean[][] visit = new boolean[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				dfs(graph, i, j, N, M, visit);
			}
		}
	}
	
}
