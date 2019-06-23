package algorithm;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {

		// 숫자 개수 출력하기
		int n = 421314218;
		
		// 개수를 카운트 하는 배열을 선언
		int[] arr = new int[10];
		
		// 숫자의 끝자리를 취득
		while (n > 0) {

			arr[n % 10]++;

			n /= 10;

		}
		
		// 배열 출력
		for (int i = 0; i < arr.length; i++) {

			System.out.println(i+"의 개수 : "+arr[i]);

		}

	}
}
