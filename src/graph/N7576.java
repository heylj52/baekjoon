package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair5 {
	int x;
	int y;
	public Pair5(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class N7576 {
	
	public static int[] dx = {-1, 0, 1, 0};
	public static int[] dy = {0, 1, 0, -1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.nextLine();
		int[][] box = new int[N][M];
		int[][] ripe = new int[N][M];
		Queue<Pair5> queue = new LinkedList<Pair5>();
		int cnt = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				box[i][j] = sc.nextInt();
				ripe[i][j] = -1;
				if(box[i][j] == 1) {
					ripe[i][j] = 0;
					queue.offer(new Pair5(i, j));
				}
				if(box[i][j] == 0) cnt++;
			}
		}
		
		if(cnt==0) {
			System.out.println(0);
		}else {
			while(!queue.isEmpty()) {
				Pair5 pair = queue.poll();
				for(int i=0; i<4; i++) {
					int nx = pair.x + dx[i];
					int ny = pair.y + dy[i];
					if(0<=nx && nx<N && 0<=ny && ny<M) {
						if(box[nx][ny]==0 && ripe[nx][ny]==-1) {
							ripe[nx][ny] = ripe[pair.x][pair.y] + 1;
							ans = ripe[pair.x][pair.y] + 1;
							queue.offer(new Pair5(nx, ny));
						}
					}
				}
			}
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					if(box[i][j]!=-1 && ripe[i][j]==-1) {
						ans = -1;
						break;
					}
					
				}
			}
			System.out.println(ans);
		}

	}
	
}
