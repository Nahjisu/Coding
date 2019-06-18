package algorithm;

import java.util.Scanner;

public class AlphabetChange {

	public static void main(String[] args) {

		// 입력 받은 알파벳을 변환 (대문자면 소문자 소문자면 대문자로 변환)
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		// char로 변환한다.
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			// 알파벳이 소문자면 대문자로 변환한다.
			if (arr[i] == str.toLowerCase().charAt(i)) {

				arr[i] = str.toUpperCase().charAt(i);

				// 알파벳이 대문자면 소문자로 변환한다.
			} else {

				arr[i] = str.toLowerCase().charAt(i);

			}
		}

		// 변환한 배열을 출력
		System.out.println(arr);

	}

}
