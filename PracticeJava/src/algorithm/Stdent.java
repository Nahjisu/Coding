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

			System.out.println("��� �˻��Ͻ÷��� y �����Ͻ÷��� n");

			String input = sc.nextLine();

			if (input.equals("y")) {

				System.out.println("�̸��� �Է��� �ּ���");

				String name = sc.nextLine();

				for (Stdents sts : list) {

					if (sts.getName().equals(name)) {

						System.out.println(sts.getNo());

						flag = true;

					}

				}

				if (!flag) {

					System.out.println("�̸��� �������� �ʽ��ϴ�.");
				}

			} else if (input.equals("n")) {

				System.out.println("�˻��� �����մϴ�.");

				break;
			}

		}

	}

}
