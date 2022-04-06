package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class N13913 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int K = sc.nextInt();
		boolean[] visit = new boolean[100001];
		int[] disit = new int[100001];
		int[] from = new int[100001];
		Arrays.fill(disit, -1);
		
		visit[M] = true;
		disit[M] = 0;
		int N = 0;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(M);
		
		while(!queue.isEmpty()) {
			if(visit[K]==true) break;
			
			N = queue.poll();
			if(0<=N-1 && N-1<=100000) {
				if(visit[N-1]==false) {
					visit[N-1] = true;
					disit[N-1] = disit[N] + 1;
					from[N-1] = N;
					queue.offer(N-1);
				}
			}
			
			if(0<=N+1 && N+1<=100000) {
				if(visit[N+1]==false) {
					visit[N+1] = true;
					disit[N+1] = disit[N] + 1;
					from[N+1] = N;
					queue.offer(N+1);
				}
			}
			
			if(0<=N*2 && N*2<=100000) {
				if(visit[N*2]==false) {
					visit[N*2] = true;
					disit[N*2] = disit[N] + 1;
					from[N*2] = N;
					queue.offer(N*2);
				}
			}
		}
		
		System.out.println(disit[K]);
		List<Integer> trace = new ArrayList<Integer>();
		trace(M, K, from, trace);
		for(int i=disit[K]; i>=0; i--) {
			System.out.print(trace.get(i)+" ");
		}
	}
	
	public static void trace(int N, int K, int[] from, List<Integer> trace) {
		trace.add(K);
		if(N!=K) {
			trace(N, from[K], from, trace);
		}
	}
}
