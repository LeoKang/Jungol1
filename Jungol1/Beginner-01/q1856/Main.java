package q1856;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		// 2nd
		int[][] ar = new int[n][m];
		int num = 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < m; j++) {
					ar[i][j] = num++;
				}
			} else {
				for (int j = m - 1; j >= 0; j--) {
					ar[i][j] = num++;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

		// 1st
//		int num = 1;
//		for (int i = 0; i < n; i++) {
//			if (i % 2 == 0) {
//				if(i != 0) {
//					num = num + (m + 1);
//				}
//				for (int j = 0; j < m; j++) {
//					System.out.print(num + " ");
//					num++;
//				}
//			} else {
//				num = num + (m - 1);
//				for (int j = 0; j < m; j++) {
//					System.out.print(num + " ");
//					num--;
//				}
//			}
//			System.out.println();
//		}
	}
}
