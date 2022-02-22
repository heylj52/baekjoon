package math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N6588_TO {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				break;
			}
			int prime[] = new int[num];
			boolean check[] = new boolean[num+1];
			int pn = 0;
			for(int i=2; i<=num; i++) {
				if(check[i] == false) {
					prime[pn++] = i;
					
					for(int j=i+i; j<=num; j+=i) {
						check[j] = true;
					}
				}
			}
			
			int a = 0;
			int b = 0;
			for(int i=0; i<prime.length; i++) {
				if(isDecimal(num - prime[i])) {
					a = prime[i];
					b = num - prime[i];
					break;
				}
			}
			
			bw.write(num + "=" + a + "+" + b + "\n");
			
		}
		bw.flush();
		bw.close();
		
	}
	
	public static boolean isDecimal(int b) {
		
		for(int i=2; i*i<=b; i++) {
			if(b%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
}
