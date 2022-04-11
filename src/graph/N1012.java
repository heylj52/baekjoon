package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class N1012 {
	
	public static int[] dx = {-1, 1, 0, 0};
	public static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		while(size-- > 0) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int K = sc.nextInt();
			ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
			int[] visit = new int[K];
			for(int i=0; i<K; i++) {
				graph.add(new ArrayList<Integer>());
			}
			
			for(int i=0; i<K; i++) {
				graph.get(sc.nextInt()).add(sc.nextInt());
			}
			
			int cnt = 0;
			
		}
		
	}
	
}
