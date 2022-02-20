package math1;

import java.util.Scanner;

public class N1929 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int min = Integer.parseInt(sc.next());
		int max = Integer.parseInt(sc.next());
		int pn = 0;
		
		int[] arr = new int[max];
		boolean[] chk = new boolean[max+1];
		
		for(int i=2; i<=max; i++) {
			
			if(chk[i] == false) {
				arr[pn++] = i;
				if(i*i <= max) {
					for(int j=i*2; j<=max; j=j+i) {
						chk[j] = true;
					}
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				break;
			}
			if(arr[i]>=min) {
				System.out.println(arr[i]);
			}
		}
	}
	
}
