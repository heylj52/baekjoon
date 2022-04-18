package graph;

import java.util.Scanner;

public class N16929 {

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
	}
	
}
