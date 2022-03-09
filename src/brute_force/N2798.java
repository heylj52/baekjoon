package brute_force;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N2798 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt(); 
		List<Integer> list = new ArrayList<Integer>();
		while(n-- > 0) {
			int card = sc.nextInt();
			list.add(card);
		}
		
		int max = 0;
		for(int x=0; x<list.size(); x++) {
			for(int y=0; y<list.size(); y++) {
				if(x != y) {
					for(int z=0; z<list.size(); z++) {
						if(x != z && y != z) {
							int su = list.get(x) + list.get(y) + list.get(z);
							if(max < su && su <= m) max = su;
						}
					}
				}
			}
		}
		System.out.println(max);
	}
	
}
