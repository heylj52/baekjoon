package data_structure;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 단어뒤집기
 * 
 * [문제]
 * 문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
 * 
 * [입력]
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다. 
 * 단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.
 * 
 * [출력] 
 * 각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.
 */
public class N9093_reserveWord {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.nextLine();
		Stack<Character> stack = new Stack<Character>();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<size; i++) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			
			while(st.hasMoreTokens()) {
				String token = st.nextToken();
				for(int x=0; x<token.length(); x++) {
					stack.push(token.charAt(x));
				}
				
				for(int x=0; x<token.length(); x++) {
					bw.write(stack.pop());
				}
				bw.write(" ");
			}
			bw.write("\n");	
		}
		bw.flush();
		bw.close();
		
	}
	
}
