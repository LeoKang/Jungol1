package q172;

import java.util.Scanner;

public class Main {
	public static void func(int p) {
		for (int i = 1; i <= p; i++) {
			for (int j = i, k = 0; k < p; j+=i, k++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

//		System.out.println(n);

		func(n);
	}
}
