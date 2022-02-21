package math1;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class N1934 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(sc.next());
		
		while(size-- > 0) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			
			int gcd = gcd(a, b);
			
			bw.write((a*b)/gcd+"\n");
			
		}
		bw.flush();
		bw.close();
		
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
