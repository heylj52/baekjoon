package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class N1920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] arrN = new int[n];
		for(int i=0; i<n; i++) {
			arrN[i] = sc.nextInt();
		}
		sc.nextLine();
		int m = Integer.parseInt(sc.nextLine());
		int[] arrM = new int[m];
		for(int i=0; i<m; i++) {
			arrM[i] = sc.nextInt();
		}
		
		Arrays.sort(arrN);
		
		for(int i=0; i<arrM.length; i++) {
			int low = 0;
			int high = arrN.length-1;
			int x = arrM[i];
			while(true) {
				if(x > arrN[arrN.length-1]) {
					System.out.println("0");
					break;
				}
				if(low > high) {
					System.out.println("0");
					break;
				}
				int mid = arrN[(low+high)/2];
				if(mid == x) {
					System.out.println("1");
					break;
				}
				if(mid > x) {
					high = mid-1;
				}
				if(mid < x) {
					low = mid+1;
				}
			}
		}
		
	}
	
}
