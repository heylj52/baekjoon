package graph;

import java.util.Scanner;

public class N16929 {
	
	static char[][] graph;
	static boolean[][] visit;
	static int[][] dist;
	static int N;
	static int M;
	public static int[] dx = {-1, 1, 0, 0};
	public static int[] dy = {0, 0, -1, 1};
	
	public static boolean dfs(int i, int j, int cnt, char color) {
		if(visit[i][j]) {
			if(cnt-dist[i][j]>=4) {
				return true;
			}else {
				return false;
			}
		}
		visit[i][j] = true;
		dist[i][j] = cnt;
		for(int n=0; n<4; n++) {
			int nx = i + dx[n];
			int ny = j + dy[n];
			if(0<=nx && nx<N && 0<=ny && ny<M) {
				if(graph[nx][ny]==color) { 
					 if(dfs(nx, ny, cnt+1, color)) return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		sc.nextLine();
		graph = new char[N][M];
		for(int i=0; i<N; i++) {
			String str = sc.nextLine();
			for(int j=0; j<M; j++) {
				graph[i][j] = str.charAt(j);
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				visit = new boolean[N][M];
				dist = new int[N][M];
				if(dfs(i, j, 1, graph[i][j])) {
					System.out.println("Yes");
					System.exit(0);
				}
			}
		}
		System.out.println("No");
	}
	
}
