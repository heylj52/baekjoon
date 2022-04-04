package graph;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair6 {
	int x;
	int y;
	public Pair6(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class N7562 {
	
	public static int[] dx = {-2, -2, -1, 1, 2, 2, 1, -1};
	public static int[] dy = {-1, 1, 2, 2, 1, -1, -2, -2};

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = sc.nextInt();
		while(size-- > 0) {
			int l = sc.nextInt();
			int[][] board = new int[l][l];
			for(int[] i : board) {
				Arrays.fill(i, -1);
			}
			Pair6 start = new Pair6(sc.nextInt(), sc.nextInt());
			Pair6 end = new Pair6(sc.nextInt(), sc.nextInt());
			Queue<Pair6> queue = new LinkedList<Pair6>();
			queue.offer(start);
			board[start.x][start.y] = 0;
			while(!queue.isEmpty()) {
				Pair6 pair = queue.poll();
				for(int i=0; i<8; i++) {
					int nx = pair.x + dx[i];
					int ny = pair.y + dy[i];
					if(0<=nx && nx<l && 0<=ny && ny<l) {
						if(board[nx][ny]==-1) {
							board[nx][ny] = board[pair.x][pair.y] + 1;
							queue.offer(new Pair6(nx, ny));
						}
					}
				}
			}
			bw.write(board[end.x][end.y]+"\n");
		}
		bw.flush();
		bw.close();
	}
	
}
