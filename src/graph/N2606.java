package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N2606 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int N = sc.nextInt(); 
		int M = sc.nextInt(); 
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<N+1; i++) {
			graph.add(new ArrayList<Integer>());
		}
		boolean[] visit = new boolean[N+1];
		for(int i=0; i<M; i++) {
			int f = sc.nextInt();
			int e = sc.nextInt();
			graph.get(f).add(e);
			graph.get(e).add(f);
			
		}
		int start = 1;
		int cnt = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		visit[start] = true;
		while(!queue.isEmpty()) {
			int p = queue.poll();
			for(int i:graph.get(p)) {
				if(visit[i]==false) {
					visit[i] = true;
					queue.add(i);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
