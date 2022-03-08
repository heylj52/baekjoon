package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class N11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		int result = 0;
		List<Integer> list = new ArrayList<Integer>();
		while(size-- > 0) {
			int n = sc.nextInt();
			list.add(n);
		}
		
		Collections.sort(list);
		for(int i=0; i<list.size(); i++) {
			result += list.get(i)*(list.size()-i);
		}
		System.out.println(result);
	}
	
}
