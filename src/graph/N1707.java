package graph;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class N1707 {
	
	public String[] ans;
	
	public static void dfs(ArrayList<ArrayList<Integer>> graph, int[] check, int N) {
		for(int i : graph.get(N)) {
			if(check[i] == 0) {
				check[i] = 3-check[N];
				dfs(graph, check, i);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int K = sc.nextInt();
		for(int i=0; i<K; i++) {
			String ans = "YES";
			int V = sc.nextInt();
			int E = sc.nextInt();
			ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
			for(int g=0; g<V+1; g++) {
				graph.add(new ArrayList<Integer>());
			}
			int[] check = new int[V+1];
			check[1] = 1;
			
			for(int j=0; j<E; j++) {
				int u = sc.nextInt();
				int v = sc.nextInt();	
				graph.get(u).add(v);
				graph.get(v).add(u);
			}
			for(int v=1; v<V+1; v++) {
				dfs(graph, check, v);
			}
			for(int v=1; v<V+1; v++) {
				for(int g : graph.get(v)) {
					if(check[g]==check[v]) {
						ans = "NO";
						break;
					}
				}
			}
			bw.write(ans+"\n");
		}
		bw.flush();
		bw.close();
	}
	
}
