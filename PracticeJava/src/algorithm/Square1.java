package algorithm;

import java.util.Scanner;

public class Square1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int num = 1;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				System.out.printf("%4d", num);
				num++;
			}

			System.out.println();

		}

	}

}
