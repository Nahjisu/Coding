package algorithm;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {

		// �ִ� ����� ���ϱ�
		Scanner sc = new Scanner(System.in);

		// �ִ� ����� ����
		int a = sc.nextInt();
		int b = sc.nextInt();

		int small = a;
		int big = b;

		// �ִ� �����
		int gcd = 1;

		// ó�� ���ڰ� Ŭ ��� ���� �ٲ۴�.
		if (small > big) {

			a = big;
			b = small;

		}

		// ���� ������ ������ ������ ������ ���ڸ� ������.
		for (int i = 1; i <= small; i++) {

			if (a % i == 0 && b % i == 0) {

				gcd = i;
			}

		}

		System.out.println(gcd);

	}

}
