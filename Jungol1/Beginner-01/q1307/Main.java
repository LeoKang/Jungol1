package q1307;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int cnt = 0;
		int[][] ar = new int[n][n];
		for (int i = ar.length - 1; i >= 0; i--) {
			for (int j = ar[i].length - 1; j >= 0; j--) {
//				System.out.println(j + " " + i);
				if (cnt >= 26) {
					cnt = 0;
				}
				ar[j][i] = cnt++;
			}
		}

//		for (int i = 0; i < ar.length; i++) {
//			for (int j = 0; j < ar[i].length; j++) {
//				System.out.print(ar[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println("----------------");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				int c = ar[i][j];
				System.out.printf("%c ", (char) (c + 'A'));
			}
			System.out.println();
		}
	}
}
