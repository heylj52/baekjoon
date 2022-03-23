package brute_force;

import java.util.Scanner;

public class N1748 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String val = sc.nextLine();
		int n = Integer.parseInt(val);
		int n_ori = n;
		int sum = 0;
		int[] arr = {9, 90*2, 900*3, 9000*4, 90000*5, 900000*6, 9000000*7,90000000*8, 9};
		int cnt = 0;
		while(n/10>0) {
			cnt++;
			sum += arr[cnt-1];
			n = n/10;
		}
		sum += (n_ori - Math.pow(10, val.length()-1)+1)*val.length();
		System.out.println(sum);
	}
	
}
