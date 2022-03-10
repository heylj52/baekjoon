package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class N4949 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String content = "";
		while(!content.equals(".")) {
			content = br.readLine();
		
			Stack<Character> stack = new Stack<Character>();
			for(int i=0; i<content.length(); i++) {
				char c = content.charAt(i);
				if(c == '.') break;
				if(stack.isEmpty() && (c == ')' || c == ']')) {
					stack.add(c);
					break;
				}
				if(c =='(' || c=='[') stack.add(c);
				if((c == ')' && stack.peek() == '(') || (c == ']' && stack.peek() == '[')) {
					stack.pop();
				}else if((c == ')' && stack.peek() != '(') || (c == ']' && stack.peek() != '[')) {
					stack.add(c);
					break;
				}
			}
			String result = stack.isEmpty()? "yes" : "no";
			bw.write(result+"\n");
		}
		bw.flush();
		bw.close();
	}
	
}
