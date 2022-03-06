package data_structure;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class N10808 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = sc.nextLine();
		int[] result = new int[26];
		for(int i=0; i<word.length(); i++) {//97~122
			int ascii = (int)word.charAt(i);
			result[ascii-97]++;
		}
		
		for(int i=0; i<result.length; i++) {
			bw.write(result[i]+" ");
		}
		bw.flush();
		bw.close();
	}
	
}
