package data_structure;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class N10820 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(sc.hasNext()) {
			String s = sc.nextLine();
			int[] result = new int[4];
			for(int i=0; i<s.length(); i++) {
				char c = s.charAt(i);
				if(c >= 97 && c < 123) {
					result[0]++;
				}else if(c >= 65 && c < 91) {
					result[1]++;
				}else if(c >= 48 && c < 58) {
					result[2]++;
				}else if(c == ' ') {
					result[3]++;
				}
			}
			for(int i : result) {
				bw.write(i + " ");
			}
		}
		bw.flush();
		bw.close();
	}
	
}
