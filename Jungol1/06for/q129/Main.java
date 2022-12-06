package q129;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = '\0';
		do {
			System.out.print("Base = ");
			int base = sc.nextInt();
			System.out.print("Height = ");
			int height = sc.nextInt();
			System.out.println("Triangle width = " + (base * height / (double) 2));
			System.out.print("Continue? ");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
	}
}
