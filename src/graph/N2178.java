package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair4 {
	int x;
	int y;
	public Pair4(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class N2178 {
	
	public static int[] dx = {-1, 0, 1, 0};
	public static int[] dy = {0, 1, 0, -1};
	
	public static int bfs(int[][] arr, int[][] visit, int N, int M) {
		Queue<Pair4> queue = new LinkedList<Pair4>();
		visit[0][0] = 1;
		queue.offer(new Pair4(0, 0));
		while(!queue.isEmpty()) {
			Pair4 pair = queue.poll();
			for(int i=0; i<4; i++) {
				int nx = pair.x + dx[i];
				int ny = pair.y + dy[i];
				if(0<=nx && nx<N && 0<=ny && ny<M) {
					if(arr[nx][ny]==1 && visit[nx][ny]==0) {
						queue.offer(new Pair4(nx, ny));
						visit[nx][ny] = visit[pair.x][pair.y]+1;
					}
				}
				
			}
		}
		
		return visit[N-1][M-1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		int[][] arr = new int[N][M];
		for(int i=0; i<N; i++) {
			String str = sc.nextLine();
			for(int j=0; j<M; j++) {
				arr[i][j] = str.charAt(j)-'0';
			}
		}
		
		int[][] visit = new int[N][M];
		System.out.println(bfs(arr, visit, N, M));
		
		
	}
	
}
