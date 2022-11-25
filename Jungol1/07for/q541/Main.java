package q541;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		sc.close();

		int cnt = 1;
		do {
			System.out.print(c);
		} while (cnt++ < 20);
	}
}
