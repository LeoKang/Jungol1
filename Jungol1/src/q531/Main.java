package q531;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();

		System.out.println(score);

		/*
		 * 90 ~ 99 / 10 = 9
		 * 80 ~ 89 / 10 = 8
		 */
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		}
	}
}