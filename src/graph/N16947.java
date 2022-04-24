package graph;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class N16947 {
	
	static int N;
	static boolean[] visit;
	static int[] dist;
	static ArrayList<ArrayList<Integer>> graph;
	static Stack<Integer> stack;
	
	public static int dfs(int x, int p) {
		visit[x] = true;
		stack.add(x); 
		for(int g : graph.get(x)) {
			if(visit[g]==false) {
				
			}
		}
		return -2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=N; i++) {
			graph.add(new ArrayList<Integer>());
		}
		for(int i=1; i<=N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			graph.get(x).add(y);
			//graph.get(y).add(x);
		}
		
		for(int i=1; i<=N; i++) {
			visit = new boolean[N+1];
			dist = new int[N+1];
			stack = new Stack<Integer>();
			
		}
	
	}
	
}
