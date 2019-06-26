package algorithm;

import java.util.Scanner;

public class Multplication {

	public static void main(String[] args) {
		
		//구구단 출력 입력 받은 수 s단부터 f단까지 출력
		
		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int f = sc.nextInt();

		for (int i = s; i <= f; i++) {

			for (int j = 1; j <= 9; j++) {

				System.out.println(i + "* " + j + " = " + i * j);

			}

			System.out.println();
		}

	}

}
