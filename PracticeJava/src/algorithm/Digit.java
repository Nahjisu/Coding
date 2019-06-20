package algorithm;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {

		// 각 자릿수의 합 구하기
		Scanner sc = new Scanner(System.in);

		// 입력 받은 수
		int num = sc.nextInt();

		// 자릿수의 합을 저장하는 변수
		int sum = 0;

		// 입력 받은 수가 0이 될 때까지 나눈다.
		while (num > 0) {

			sum += num % 10;

			num = num / 10;

		}

		System.out.println(sum);

	}

}
