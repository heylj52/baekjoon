package dynamic_programming;

import java.util.Scanner;

public class N1463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.next());
		int mem[] = new int[num+1];
		
		mem[1] = 0;
		for(int i=2; i<=num; i++) {
			mem[i] = mem[i-1] + 1;
			if(i%2==0 && mem[i] > mem[i/2] + 1) {
				mem[i] = mem[i/2] + 1;
			}
			if(i%3==0 && mem[i] > mem[i/3] + 1) {
				mem[i] = mem[i/3] + 1;
			}
		}
		
		System.out.println(mem[num]);
		
	}

	
}
