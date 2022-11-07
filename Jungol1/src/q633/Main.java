package q633;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Korea\n2. USA\n3. Japan\n4. China");
		System.out.print("number? ");
		int number = sc.nextInt();
		sc.close();

		System.out.println();

		switch (number) {
		case 1:
			System.out.println("Seoul");
			break;

		case 2:
			System.out.println("Washington");
			break;

		case 3:
			System.out.println("Tokyo");
			break;

		case 4:
			System.out.println("Beijing");
			break;

		default:
			System.out.println("none");
		}
	}
}