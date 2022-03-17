package data_structure;

import java.util.Scanner;

public class N10824 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long result = 0L;
		for(int i=0; i<2; i++) {
			String str = sc.next() + sc.next();
			result += Long.parseLong(str);
		}
		System.out.println(result);
	}
	
}
