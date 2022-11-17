package q1303;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
//		System.out.println(n + " " + m);

		// 2nd
		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}

		// 1st
//		int[][] ar;
//		ar = new int[n][m];
//		int num = 1;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				ar[i][j] = num++;
//			}
//		}
//
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				System.out.print(ar[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
