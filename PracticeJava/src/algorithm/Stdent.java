package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stdent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Stdents st1 = new Stdents("na", "123");
		Stdents st2 = new Stdents("kim", "102");
		Stdents st3 = new Stdents("park", "103");

		boolean flag = false;

		List<Stdents> list = new ArrayList<>();

		list.add(st1);
		list.add(st2);
		list.add(st3);

		while (true) {

			System.out.println("계속 검색하시려면 y 종료하시려면 n");

			String input = sc.nextLine();

			if (input.equals("y")) {

				System.out.println("이름을 입력해 주세요");

				String name = sc.nextLine();

				for (Stdents sts : list) {

					if (sts.getName().equals(name)) {

						System.out.println(sts.getNo());

						flag = true;

					}

				}

				if (!flag) {

					System.out.println("이름이 존재하지 않습니다.");
				}

			} else if (input.equals("n")) {

				System.out.println("검색을 종료합니다.");

				break;
			}

		}

	}

}
