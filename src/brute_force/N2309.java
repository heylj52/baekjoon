package brute_force;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N2309 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] heights = new int[9];
		for(int i=0; i<9; i++) {
			heights[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(heights);
		int i=0;
		int j=0;
		boolean flg = false;
		for(i=0; i<heights.length-1; i++) {
			for(j=i+1; j<heights.length; j++) {
				int sum = 0;
				for(int h: heights) {
					if(h != heights[i] && h != heights[j]) {
						sum += h;
					}
				}
				if(sum == 100) {
					flg = true;
					break;
				}
			}
			if(flg) {
				break;
			}
		}
		
		for(int h: heights) {
			if(h != heights[i] && h != heights[j]) {
				System.out.println(h);
			}
		}
	}
	
}
