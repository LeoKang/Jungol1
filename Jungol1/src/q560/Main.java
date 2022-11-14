package q560;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int min = Integer.MAX_VALUE;

		int i = 0;
		do {
			num[i] = sc.nextInt();
			if (min > num[i]) {
				min = num[i];
			}
			i++;
		} while (i < num.length);
		sc.close();

		System.out.println(min);
	}
}