package math1;

public class Sieve_of_Eratosthenes {

	public static void main(String[] args) {
		//1~100중 소수를 구해라.
		int pn = 0;
		
		int[] arr = new int[100];
		boolean[] chk = new boolean[101];
		
		for(int i=2; i<=100; i++) {
			
			if(chk[i] == false) {
				arr[pn++] = i;
				if(i*i <= 100) {
					for(int j=i*2; j<=100; j=j+i) {
						chk[j] = true;
					}
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				break;
			}
			System.out.println(arr[i]);
		}
	}
	
}
