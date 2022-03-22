package brute_force;

import java.util.Scanner;

public class N14500 {

	static int[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		arr = new int[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int max = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(i <= N-4) {
					int temp = arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+3][j];
					if(max < temp) max = temp;
				}
				if(j <= M-4) {
					int temp = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i][j+3];
					if(max < temp) max = temp;
				}
				
				if(i <= N-2 && j <= M-2) {
					int temp = arr[i][j] + arr[i+1][j+1] + arr[i+1][j] + arr[i][j+1];
					if(max < temp) max = temp;
				}
				
				if(i <= N-3 && j <= M-2) {
					int temp = arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+2][j+1];
					if(max < temp) max = temp;
				}
				if(i <= N-2 && j <= M-3) {
					int temp = arr[i+1][j] + arr[i+1][j+1] + arr[i+1][j+2] + arr[i][j+2];
					if(max < temp) max = temp;
				}
				if(i <= N-3 && j <= M-2) {
					int temp = arr[i][j] + arr[i][j+1] + arr[i+1][j+1] + arr[i+2][j+1];
					if(max < temp) max = temp;
				}
				if(i <= N-3 && j <= M-2) {
					int temp = arr[i][j] + arr[i][j+1] + arr[i+1][j] + arr[i+2][j];
					if(max < temp) max = temp;
				}
				if(i <= N-3 && j <= M-2) {
					int temp = arr[i+2][j] + arr[i+2][j+1] + arr[i+1][j+1] + arr[i][j+1];
					if(max < temp) max = temp;
				}
				if(i <= N-2 && j <= M-3) {
					int temp = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+2];
					if(max < temp) max = temp;
				}
				if(i <= N-2 && j <= M-3) {
					int temp = arr[i][j] + arr[i+1][j] + arr[i][j+1] + arr[i][j+2];
					if(max < temp) max = temp;
				}
				if(i <= N-2 && j <= M-3) {
					int temp = arr[i][j] + arr[i+1][j] + arr[i+1][j+1] + arr[i+1][j+2];
					if(max < temp) max = temp;
				}
				
				if(i <= N-3 && j <= M-2) {
					int temp = arr[i][j] + arr[i+1][j] + arr[i+1][j+1] + arr[i+2][j+1];
					if(max < temp) max = temp;
				}
				if(i <= N-3 && j <= M-2) {
					int temp = arr[i][j+1] + arr[i+1][j+1] + arr[i+1][j] + arr[i+2][j];
					if(max < temp) max = temp;
				}
				if(i <= N-2 && j <= M-3) {
					int temp = arr[i][j] + arr[i][j+1] + arr[i+1][j+1] + arr[i+1][j+2];
					if(max < temp) max = temp;
				}
				if(i <= N-2 && j <= M-3) {
					int temp = arr[i+1][j] + arr[i+1][j+1] + arr[i][j+1] + arr[i][j+2];
					if(max < temp) max = temp;
				}
				
				if(i <= N-2 && j <= M-3) {
					int temp = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1];
					if(max < temp) max = temp;
				}
				if(i <= N-2 && j <= M-3) {
					int temp = arr[i][j+1] + arr[i+1][j+1] + arr[i+1][j] + arr[i+1][j+2];
					if(max < temp) max = temp;
				}
				if(i <= N-3 && j <= M-2) {
					int temp = arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+1][j+1];
					if(max < temp) max = temp;
				}
				if(i <= N-3 && j <= M-2) {
					int temp = arr[i][j+1] + arr[i+1][j] + arr[i+1][j+1] + arr[i+2][j+1];
					if(max < temp) max = temp;
				}
			}
		}
		System.out.println(max);
		
	}
	
}
