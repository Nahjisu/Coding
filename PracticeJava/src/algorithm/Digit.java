package algorithm;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {

		// �� �ڸ����� �� ���ϱ�
		Scanner sc = new Scanner(System.in);

		// �Է� ���� ��
		int num = sc.nextInt();

		// �ڸ����� ���� �����ϴ� ����
		int sum = 0;

		// �Է� ���� ���� 0�� �� ������ ������.
		while (num > 0) {

			sum += num % 10;

			num = num / 10;

		}

		System.out.println(sum);

	}

}
