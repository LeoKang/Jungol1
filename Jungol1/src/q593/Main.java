package q593;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inp = 0;
		do {
			System.out.print("ASCII code =? ");
			inp = sc.nextInt();
			if (inp < 33 || inp > 127) {
				break;
			}
			System.out.printf("%c\n", inp);
		} while (33 <= inp && inp <= 127);
		sc.close();
	}
}
