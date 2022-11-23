package q123;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number? ");
		int inp = sc.nextInt();
		sc.close();

		String[] animal = { "dog", "cat", "chick" };
		if (1 <= inp && inp <= 3) {
			System.out.println(animal[inp - 1]);
		} else {
			System.out.println("I don't know.");
		}
	}
}
