package graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N1697 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		boolean[] visit = new boolean[100001];
		int[] disit = new int[100001];
		
		Arrays.fill(disit, -1);
		
		visit[N] = true;
		disit[N] = 0;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(N);
		
		while(!queue.isEmpty()) {
			if(visit[K]==true) break;
			
			N = queue.poll();
			if(0<=N-1 && N-1<=100000) {
				if(visit[N-1]==false) {
					visit[N-1] = true;
					disit[N-1] = disit[N] + 1;
					queue.offer(N-1);
				}
			}
			
			if(0<=N+1 && N+1<=100000) {
				if(visit[N+1]==false) {
					visit[N+1] = true;
					disit[N+1] = disit[N] + 1;
					queue.offer(N+1);
				}
			}
			
			if(0<=N*2 && N*2<=100000) {
				if(visit[N*2]==false) {
					visit[N*2] = true;
					disit[N*2] = disit[N] + 1;
					queue.offer(N*2);
				}
			}
		}
		
		System.out.println(disit[K]);
		
	}
	
}
