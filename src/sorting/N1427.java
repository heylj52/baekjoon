package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class N1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String[] arrayN = n.split("");
		Arrays.sort(arrayN, Collections.reverseOrder());
		for(String s : arrayN) {
			System.out.print(s);
		}
	}
	
}
