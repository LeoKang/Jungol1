package q558;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[100];

		int i = 0;
		do {
			ar[i] = sc.nextInt();
		} while (ar[i++] != 0);
		sc.close();

		for (int j = i - 2; j >= 0; j--) {
			System.out.print(ar[j] + " ");
		}
	}
}
