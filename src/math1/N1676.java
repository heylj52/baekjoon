package math1;

import java.util.Scanner;

public class N1676 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int cnt = 0;
		for(int i = num; i>=1; i--) {
			int j = i;
			while(j%5==0) {
				cnt++;
				j/=5;
			}
		}
		System.out.println(cnt);
	}
	
}
