package algorithm;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {

		// ���� ���� ����ϱ�
		int n = 421314218;
		
		// ������ ī��Ʈ �ϴ� �迭�� ����
		int[] arr = new int[10];
		
		// ������ ���ڸ��� ���
		while (n > 0) {

			arr[n % 10]++;

			n /= 10;

		}
		
		// �迭 ���
		for (int i = 0; i < arr.length; i++) {

			System.out.println(i+"�� ���� : "+arr[i]);

		}

	}
}
