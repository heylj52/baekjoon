package brute_force;

import java.util.Scanner;

public class N1107 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String channel = sc.nextLine();
		int size = Integer.parseInt(sc.nextLine());
		int[] breakdown = new int[size];
		for(int i=0; i<breakdown.length; i++) {
			breakdown[i] = sc.nextInt();
		}
		System.out.println(Math.min(num_bt(channel, breakdown), pm_bt(channel)));
	}
	
	public static int num_bt(String channel, int[] breakdown) {
		int min_length = 1000000;
		int channel_int = Integer.parseInt(channel);
		for(int i=0; i<1000000; i++) {
			if(break_down(i, breakdown)==false) {
				int len = 0;
				len += (i+"").length();
				if(i!=channel_int) {
					len += Math.abs(channel_int-i);
				}
				if(min_length>len) min_length = len;
			}
		}
		
		return min_length;
	}
	
	public static int pm_bt(String channel) {
		return Math.abs(Integer.parseInt(channel)-100);
	}
	
	public static boolean break_down(int i, int[] breakdown) {
		String str = i+"";
		for(int b : breakdown) {
			for(int s=0; s<str.length(); s++) {
				if(str.charAt(s)-'0' == b) {
					return true;
				}
			}
		}
		return false;
	}
	
}
