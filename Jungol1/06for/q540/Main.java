package q540;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			int inp = sc.nextInt();

			if (inp == -1) {
				sc.close();
				break;
			} else if (inp % 3 == 0) {
				int ret = inp / 3;
				System.out.println(ret);
			}
		}
	}
}
