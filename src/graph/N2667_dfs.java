package graph;

import java.util.Arrays;
import java.util.Scanner;

class Pair2 {
	int x;
	int y;
	public Pair2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class N2667_dfs {

	public static int[] dx = {-1, 1, 0, 0};
	public static int[] dy = {0, 0, -1, 1};
	
	public static void dfs(int[][] arr, int[][] group, int x, int y, int size, int cnt) {
		group[x][y] = cnt;
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(0<=nx && nx<size && 0<=ny && ny<size) {
				if(arr[nx][ny]==1 && group[nx][ny]==0) {
					dfs(arr, group, nx, ny, size, cnt);
				}
			}
		}
	}
	
	public static int cnt(int[][] group, int cnt) {
		int result = 0;
		for(int i=0; i<group.length; i++) {
			for(int j=0; j<group[i].length; j++) {
				if(group[i][j]==cnt) result++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.nextLine();
		int[][] arr = new int[size][size];
		for(int i=0; i<size; i++) {
			String str = sc.nextLine();
			for(int j=0; j<size; j++) {
				arr[i][j] = str.charAt(j)-'0';
			}
		}
		
		int[][] group = new int[size][size];
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]==1 && group[i][j]==0) {
					dfs(arr, group, i, j, size, ++cnt);
				}
			}
		}
		System.out.println(cnt);
		int[] result = new int[cnt];
		for(int i=0; i<cnt; i++) {
			result[i] = cnt(group, i+1);
		}
		Arrays.sort(result);
		for(int i=0; i<cnt; i++) {
			System.out.println(result[i]);
		}
	}
	
}
