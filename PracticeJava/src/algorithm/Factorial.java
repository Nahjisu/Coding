package algorithm;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		// ���丮�� ���ϱ� �˰���
		// 5! = 5 * 4 * 3 * 2 * 1
		Scanner sc = new Scanner(System.in);

		// �Է� ���� ���ڸ� ����
		int input = sc.nextInt();

		// �հ踦 �����ϴ� ����
		int sum = 1;

		for (int i = 1; i <= input; i++) {

			sum *= i;

		}

		System.out.println(sum);

	}

}
