package brute_force;

import java.util.Arrays;
import java.util.Scanner;

public class N7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] arr = new int[size][2];
		int[] rank = new int[size];
		Arrays.fill(rank, 1);
		for(int i=0; i<size; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<size-1; i++) {
			for(int j=i+1; j<size; j++) {
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
					rank[i]++;
				}else if(arr[i][0]>arr[j][0] && arr[i][1]>arr[j][1]) {
					rank[j]++;
				}
			}
		}
		for(int r:rank) System.out.print(r+" ");
	}
	
}
