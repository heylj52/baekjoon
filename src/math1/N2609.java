package math1;

import java.util.Scanner;

public class N2609 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		int gcd = gcd(a, b);
		
		System.out.println(gcd);
		System.out.println((a*b)/gcd);
		
	}
	
	public static int gcd(int a, int b) {
		
		while(true) {
			int r = a % b;
			if(r == 0) {
				return b;
			}
			a = b;
			b = r;
			
		}
	}
	
}
