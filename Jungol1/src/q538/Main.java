package q538;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("numder?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

//	      System.out.println(num);

		for (;;) {
			if (0 < num) {
				System.out.println("positive integer");
			} else if (num > 0) {
				System.out.println("negative number");
			} else {
				break;
			}
		}
	}
}