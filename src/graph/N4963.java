package graph;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair3 {
	int x;
	int y;
	public Pair3(int x, int y) { 
		this.x = x;
		this.y = y;
	}
}

public class N4963 {
	
	public static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
	public static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
	
	public static void bfs(int[][] island, int[][] group, int x, int y, int cnt) {
		Queue<Pair3> queue = new LinkedList<Pair3>();
		queue.offer(new Pair3(x, y));
		group[x][y] = 1;
		while(!queue.isEmpty()) {
			Pair3 p = queue.poll();
			for(int i=0; i<8; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				if(0<=nx && nx<island.length && 0<=ny && ny<island[0].length) {
					if(island[nx][ny]==1 && group[nx][ny] == 0) {
						queue.offer(new Pair3(nx, ny));
						group[nx][ny] = 1;
					}
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0) break;
			int[][] island = new int[h][w];
			int[][] group = new int[h][w];
			int cnt = 0;
			for(int i=0; i<island.length; i++) {
				for(int j=0; j<island[i].length; j++) {
					island[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0; i<island.length; i++) {
				for(int j=0; j<island[i].length; j++) {
					if(island[i][j]==1 && group[i][j]==0) {
						bfs(island, group, i, j, ++cnt);
					}
				}
			}
			bw.write(cnt+"\n");
		}
		bw.flush();
		bw.close();
	}
	
}
