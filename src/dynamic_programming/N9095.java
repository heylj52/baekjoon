package dynamic_programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N9095 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		while(size-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int d[] = new int[n+1];
			d[0] = 1;
			d[1] = 1;
			if(n>=2) {
				d[2] = 2;
			}
			for(int i=3; i<=n; i++) {
				d[i] = d[i-3]+d[i-2]+d[i-1];
			}
			
			bw.write(d[n]+"\n");		
		}
		bw.flush();
		bw.close();
		
	}
	
}
