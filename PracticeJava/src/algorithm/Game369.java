package algorithm;

public class Game369 {

	public static void main(String[] args) {

		// 369 Game

		for (int i = 1; i <= 100; i++) {

			String str = Integer.toString(i);
			boolean check = false;

			for (int j = 0; j < str.length(); j++) {

				char ch = str.charAt(j);

				if (ch == '3' || ch == '6' || ch == '9') {

					System.out.print("¦");
					check = true;
				}
			}

			if (!check) {

				System.out.print(i + " ");

			} else if (i % 10 == 0) {

				System.out.println();

			} else {

				System.out.print(" ");
			}

		}

	}

}
