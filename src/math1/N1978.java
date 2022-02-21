package math1;

import java.util.Scanner;

public class N1978 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.next());
		int resultSize = 0;
		
		for(int j=0; j<size; j++) {
			int num = Integer.parseInt(sc.next());
			
			if(num == 1) {
				resultSize++;
			}else {
			
				for(int i=2; i*i<=num; i++) {
					if(num % i == 0) {
						resultSize++;
						break;
					}
				}
			}
			
		}
		System.out.println(size - resultSize);
		
	}
	
}
