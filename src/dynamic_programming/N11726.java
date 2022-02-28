package dynamic_programming;

import java.util.Scanner;

public class N11726 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m[] = new int[n+1];
		
		m[0] = 1;
		m[1] = 1;
		for(int i=2; i<=n; i++) {
			m[i] = m[i-1] + m[i-2];
			m[i] %= 10007;
		}
		
		System.out.println(m[n]);
		
	}
	
}
