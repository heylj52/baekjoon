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
	
	public static boolean dfs(int V) {
		visit[V] = true;
		stack.add(V);
		for(int g : graph.get(V)) {
			if(visit[g]==false) {
				if(dfs(g)) {
					return true;
				}
			}else {
				System.out.println(V +" "+stack.toString());
			}
		}
		return false;
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
			
			if(dfs(1)) {
				break;
			}
		}
	
	}
	
}
