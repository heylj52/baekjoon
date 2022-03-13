package data_structure;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class N10866 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = sc.nextInt();
		Deque<Integer> deque = new ArrayDeque<Integer>();
		while(size-- > 0) {
			String cmd = sc.next();
			if(cmd.equals("push_front")) {
				deque.addFirst(sc.nextInt());
			}else if(cmd.equals("push_back")) {
				deque.addLast(sc.nextInt());
			}else if(cmd.equals("pop_front")) {
				int popFront = (deque.isEmpty())?-1:deque.pollFirst();
				br.write(popFront+"\n");
			}else if(cmd.equals("pop_back")) {
				int popBack = (deque.isEmpty())?-1:deque.pollLast();
				br.write(popBack+"\n");
			}else if(cmd.equals("size")) {
				br.write(deque.size()+"\n");
			}else if(cmd.equals("empty")) {
				String isEmp = (deque.isEmpty())?"1":"0";
				br.write(isEmp+"\n");
			}else if(cmd.equals("front")) {
				int front = (deque.isEmpty())?-1:deque.peekFirst();
				br.write(front+"\n");
			}else if(cmd.equals("back")) {
				int back = (deque.isEmpty())?-1:deque.peekLast();
				br.write(back+"\n");
			}
		}
		br.flush();
		br.close();
	}
	
}
