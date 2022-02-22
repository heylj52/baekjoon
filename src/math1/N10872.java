package math1;

import java.util.Scanner;

public class N10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		
		int result = 1;
		while(num > 0) {
			result *= num;
			num--;
		}
		System.out.println(result);
	}
	
}
