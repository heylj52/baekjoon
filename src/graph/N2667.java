package graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair {
	int x;
	int y;
	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class N2667 {
	
	public static int[] dx = {-1, 1, 0, 0};
	public static int[] dy = {0, 0, 1, -1};
	
	public static void bfs(int[][] arr, int[][] group, int x, int y, int cnt, int size) {
		Queue<Pair> queue = new LinkedList<Pair>();
		queue.offer(new Pair(x, y));
		group[x][y] = cnt;
		
		while(!queue.isEmpty()) {
			Pair p = queue.poll();
			x = p.x;
			y = p.y;
			for(int i=0; i<4; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				if(0 <= nx && nx < size && 0<=ny && ny < size) {
					if(arr[nx][ny]==1 && group[nx][ny]==0) {
						queue.offer(new Pair(nx, ny));
						group[nx][ny] = cnt;
					}
				}
			}
		}
	}
	
	public static int size(int[][] group, int n) {
		int size = 0;
		for(int i=0; i<group.length; i++) {
			for(int j=0; j<group[i].length; j++) {
				if(group[i][j] == n) size++;
			}
		}
		return size;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		int[][] arr = new int[size][size];
		for(int i=0; i<size; i++) {
			String str = sc.nextLine();
			for(int j=0; j<size; j++) {
				arr[i][j] = str.charAt(j)-'0';
			}
		}
		
		int cnt = 0;
		int[][] group = new int[size][size];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]==1 && group[i][j]==0) {
					bfs(arr, group, i, j, ++cnt, size);
				}
			}
		}
		System.out.println(cnt);
		int[] cntArr = new int[cnt];
		for(int n=1; n<=cnt; n++) {
			cntArr[n-1] = size(group, n);
		}
		Arrays.sort(cntArr);
		for(int c=0; c<cntArr.length; c++) {
			System.out.println(cntArr[c]);
		}
	}
	
}
