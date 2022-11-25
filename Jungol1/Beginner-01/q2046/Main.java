package q2046;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

//		System.out.println(n);
//		System.out.println(m);

		switch (m) {
		case 1:
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
			break;
		case 2:
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					for (int j = 1; j <= n; j++) {
						System.out.print(j + " ");
					}
				} else {
					for (int j = n; j > 0; j--) {
						System.out.print(j + " ");
					}
				}
				System.out.println();
			}
			break;
		case 3:
			for (int i = 1; i <= n; i++) {
				for (int j = i, c = 0; c < n; c++, j += i) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			break;
		}
	}
}
