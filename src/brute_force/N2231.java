package brute_force;

import java.util.Scanner;

public class N2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//sc.nextLine();
		int result = 0;
		for(int i=n; i>0; i--) {
			int sum = i;
			String str = i +"";
			for(int j=0; j<str.length(); j++) {
				sum += Character.getNumericValue(str.charAt(j));
			}
			if(n == sum) {
				result = i;
			}
		}
		System.out.println(result);
	}
	
}
