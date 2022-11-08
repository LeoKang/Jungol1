package q562_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				sum1 += sc.nextInt();
			} else {
				sum2 += sc.nextInt();
			}
		}
		sc.close();

		System.out.println("sum : " + sum2);
		System.out.printf("avg : %.1f\n", (double) sum1 / 5);
	}
}
