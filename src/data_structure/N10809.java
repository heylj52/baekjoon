package data_structure;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class N10809 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = sc.nextLine();
		int[] result = new int[26];
		Arrays.fill(result, -1);
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			if(result[c-97] == -1) {
				result[c-97] = i;
			}
		}
		for(int i : result) {
			br.write(i+" ");
		}
		br.flush();
		br.close();
	}
	
}
