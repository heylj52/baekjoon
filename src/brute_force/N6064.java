package brute_force;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class N6064 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = sc.nextInt();
		while(n-- > 0) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			boolean find = false;
			int year = 0;
			if(x>y) {
				year = x;
				while(year<1600000000) {
					if(M==x) x=0;
					if(N==y) y=0;
					if(year%M==x && year%N==y) {
						find = true;
						break;
					}
					year += M;
				}
			}else {
				year = y;
				while(year<M*N) {
					if(M==x) x=0;
					if(N==y) y=0;
					if(year%M==x && year%N==y) {
						find = true;
						break;
					}
					year += N;
				}
			}
			if(!find) {
				year = -1;
			}
			bw.write(year+"\n");
		}
		bw.flush();
		bw.close();
	}
	
}
