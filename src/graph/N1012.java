package graph;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair7 {
	int x;
	int y;
	public Pair7(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class N1012 {
	
	public static int[] dx = {-1, 1, 0, 0};
	public static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = sc.nextInt();
		while(size-- > 0) { 
			int M = sc.nextInt();
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[][] graph = new int[N][M];
			boolean[][] visit = new boolean[N][M];
			
			for(int i=0; i<K; i++) {
				int X = sc.nextInt();
				int Y = sc.nextInt();
				graph[Y][X] = 1;
			}
			int cnt = 0;
			Queue<Pair7> queue = new LinkedList<Pair7>();
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					if(graph[i][j]==1 && visit[i][j]==false) {
						cnt++;
						visit[i][j] = true;
						queue.add(new Pair7(i, j));
						if(!queue.isEmpty()) {
							Pair7 p = queue.poll();
							for(int n=0; n<4; n++) {
								int nx = p.x + dx[n];
								int ny = p.y + dy[n];
								if(0<=nx && nx < N && 0<=ny && ny < M) {
									if(graph[nx][ny]==1 && visit[nx][ny]==false) {
										visit[nx][ny] = true;
										queue.add(new Pair7(nx, ny));
									}
								}
							}
						}
					}
				}
			}
			
			bw.write(cnt+"\n");
		}
		bw.flush();
		bw.close();
	}
	
}
