package data_structure;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class N17413 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = sc.nextLine();
		Stack<Character> stack = new Stack<Character>();
		boolean tag = false;
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			if(c == '<') {
				while(!stack.empty()) {
					bw.write(stack.pop());
				}
				tag = true;
				bw.write(c);
			}else if(c == '>') {
				tag = false;
				bw.write(c);
			}else if(tag) {
				bw.write(c);
			}else if(!tag) {
				if(c == ' ') {
					while(!stack.empty()) {
						bw.write(stack.pop());
					}
					bw.write(c);
				}else {
					stack.push(c);
				}
			}
		}
		while(!stack.empty()) {
			bw.write(stack.pop());
		}
		bw.flush();
		bw.close();
	}
	
}
