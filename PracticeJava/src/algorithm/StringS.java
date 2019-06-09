package algorithm;

import java.util.Scanner;

public class StringS {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(solution(s));
	}
	
	public static int solution(String s) {
		
		return Integer.valueOf(s);
	}
}
