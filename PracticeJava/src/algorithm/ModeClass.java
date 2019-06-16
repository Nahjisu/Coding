package algorithm;

import java.util.Scanner;

public class ModeClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] modeNum = new int[10];

		int[] arr = new int[10];

		int count = 0;

		int num = 0;

		for (int i = 0; i < 10; i++) {

			modeNum[i] = sc.nextInt();

		}

		for (int i = 0; i < 10; i++) {

			arr[modeNum[i]]++;

		}

		for (int i = 0; i < 10; i++) {

			if (count < arr[i]) {

				count = arr[i];
				num = i;
			}

		}

		System.out.println("ÃÖºó¼ö : " + num);

	}

}
