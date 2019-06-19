package algorithm;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		// 팩토리얼 구하기 알고리즘
		// 5! = 5 * 4 * 3 * 2 * 1
		Scanner sc = new Scanner(System.in);

		// 입력 받은 숫자를 선언
		int input = sc.nextInt();

		// 합계를 저장하는 변수
		int sum = 1;

		for (int i = 1; i <= input; i++) {

			sum *= i;

		}

		System.out.println(sum);

	}

}
