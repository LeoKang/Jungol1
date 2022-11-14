package q560;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		scan.close();
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}

		int min = 1000;
//		int min = Integer.MAX_VALUE;
//		int min = ar[0];
		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.println(min);
	}
}
