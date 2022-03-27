package array;

import java.util.Arrays;
import java.util.Scanner;

public class N10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		for(int i=0; i<size; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		System.out.print(array[0]+" ");
		System.out.print(array[size-1]);
	}
	
}
