package algorithm;

import java.util.Scanner;

public class AlphabetChange {

	public static void main(String[] args) {

		// �Է� ���� ���ĺ��� ��ȯ (�빮�ڸ� �ҹ��� �ҹ��ڸ� �빮�ڷ� ��ȯ)
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		// char�� ��ȯ�Ѵ�.
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			// ���ĺ��� �ҹ��ڸ� �빮�ڷ� ��ȯ�Ѵ�.
			if (arr[i] == str.toLowerCase().charAt(i)) {

				arr[i] = str.toUpperCase().charAt(i);

				// ���ĺ��� �빮�ڸ� �ҹ��ڷ� ��ȯ�Ѵ�.
			} else {

				arr[i] = str.toLowerCase().charAt(i);

			}
		}

		// ��ȯ�� �迭�� ���
		System.out.println(arr);

	}

}
