package algorithm;

import java.util.Scanner;

public class Involution {

	public static void main(String[] args) {

		// °ÅµìÁ¦°ö ±¸ÇÏ±â

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int result = 1;
		// 5 3

		for (int i = 0; i < m; i++) {

			result *= n;

		}

		System.out.println(result);

	}

}
