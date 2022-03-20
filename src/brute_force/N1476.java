package brute_force;

import java.util.Scanner;

public class N1476 {

	final static int E = 15;
	final static int S = 28;
	final static int M = 19;
	
	public static void main(String[] args) {
		int result = 0; 
		Scanner sc = new Scanner(System.in);
		int[] years = new int[3];
		for(int i=0; i<years.length; i++) {
			years[i] = sc.nextInt();
		}
		if(years[0] == E) years[0] = 0;
		if(years[1] == S) years[1] = 0;
		if(years[2] == M) years[2] = 0;
		while(true) {
			result++;
			if(result % E == years[0] && result % S == years[1] && result % M == years[2]) {
				break;
			}
		}
		System.out.println(result);
	}
	
}
