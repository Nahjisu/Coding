package algorithm;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		// 입력 받은 수가 소수인지 판별하는 알고리즘
		Scanner sc = new Scanner(System.in);

		// 숫자를 입력
		int input = sc.nextInt();

		// 소수인지 판별하기 위해 선언한다.
		boolean inputPrime = true;

		// 입력 받은 수의 절반까지 나누어 떨어지면 소수가 아니다.
		for (int i = 2; i <= input / 2; i++) {

			if (input % i == 0) {

				inputPrime = false;

			}

		}

		// 소수 판별
		if (inputPrime) {

			System.out.println(input + "은 소수 입니다.");
		} else {

			System.out.println(input + "은 소수가 아닙니다.");

		}

	}

}
