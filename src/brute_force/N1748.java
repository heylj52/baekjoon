package brute_force;

import java.util.Scanner;

public class N1748 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		int last_length = (n+"").length();
		int last = (int) (n % (Math.pow(10, last_length-1)));
		int nn = n;
		int[] arr = {9, 90*2, 900*3, 9000*4, 90000*5, 900000*6, 9000000*7,90000000*8};
		while(n/10!=0) {
			String str = n+"";
			result += arr[str.length()-2];
			n = (int) (n % (Math.pow(10, str.length()-1)));
		}
		if(nn<10) {
			result += n*last_length;
		}else {
			result += last*last_length + 1*last_length;
		}
		System.out.println(result);
	}
	
}
