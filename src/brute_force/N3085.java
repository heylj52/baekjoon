package brute_force;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N3085 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		char[][] boards = new char[size][size];
		for(int i=0; i<size; i++) {
			String str = br.readLine();
			for(int j=0; j<size; j++) {
				boards[i][j] = str.charAt(j);
			}
		}
		
		int max = 0;
		for(int i=0; i<boards.length ;i++) {
			for(int j=0; j<boards.length-1; j++) {
				char tmp = boards[i][j];
				boards[i][j] = boards[i][j+1]; 
				boards[i][j+1] = tmp;
				
				int check = check(boards);
				if(max < check) max = check; 
				
				tmp = boards[i][j];
				boards[i][j] = boards[i][j+1]; 
				boards[i][j+1] = tmp;
			}
		}
		for(int i=0; i<boards.length ;i++) {
			for(int j=0; j<boards.length-1; j++) {
				char tmp = boards[j][i];
				boards[j][i] = boards[j+1][i]; 
				boards[j+1][i] = tmp;
				
				int check = check(boards);
				if(max < check) max = check; 
				
				tmp = boards[j][i];
				boards[j][i] = boards[j+1][i]; 
				boards[j+1][i] = tmp;
			}
		}
		System.out.println(max);
	}
	
	public static int check(char[][] boards) {
		int max = 0;
		for(int i=0; i<boards.length ;i++) {
			int cnt = 1;
			for(int j=0; j<boards.length-1; j++) {
				if(boards[i][j] == boards[i][j+1]) {
					cnt++;
					if(max < cnt) max = cnt;
				}else {
					cnt = 1;
				}
			}
		}
		for(int i=0; i<boards.length ;i++) {
			int cnt = 1;
			for(int j=0; j<boards.length-1; j++) {
				if(boards[j][i] == boards[j+1][i]) {
					cnt++;
					if(max < cnt) max = cnt;
				}else {
					cnt = 1;
				}
			}
		}
		return max;
	}
	
}
