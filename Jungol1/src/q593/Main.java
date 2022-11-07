package q593;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num;
		char w1;
		do {
			System.out.print("ASCII code =? ");
			num = scan.nextInt();

			w1 = (char) num;
			System.out.println(w1);
		} while (33 <= num && num <= 127);
		scan.close();
	}
}