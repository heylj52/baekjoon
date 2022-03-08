package sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class N2750 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		Set<Integer> set = new HashSet<Integer>();
		while(size-- > 0) {
			int n = Integer.parseInt(br.readLine());
			set.add(n);
		}
		
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		for(int i=0; i<list.size(); i++) {
			bw.write(list.get(i)+"\n");
		}
		
		bw.flush();
		bw.close();
		
	}
	
}
