package algorithm;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {

		// 최대 공약수 구하기
		Scanner sc = new Scanner(System.in);

		// 최대 공약수 선언
		int a = sc.nextInt();
		int b = sc.nextInt();

		int small = a;
		int big = b;

		// 최대 공약수
		int gcd = 1;

		// 처음 숫자가 클 경우 값을 바꾼다.
		if (small > big) {

			a = big;
			b = small;

		}

		// 작은 수까지 나누어 떨어질 때까지 숫자를 나눈다.
		for (int i = 1; i <= small; i++) {

			if (a % i == 0 && b % i == 0) {

				gcd = i;
			}

		}

		System.out.println(gcd);

	}

}
