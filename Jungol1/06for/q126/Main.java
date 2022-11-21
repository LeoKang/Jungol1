package q126;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[100];
		int i = 0;
		boolean b = true;
		do {
			inp[i] = sc.nextInt();
			if (inp[i] == 0) {
				b = false;
			}
			i++;
		} while (b);
		sc.close();

//		for (int j = 0; j < i; j++) {
//			System.out.print(inp[j] + " ");
//		}

		int odd = 0, even = 0;
		for (int j = 0; j < i - 1; j++) {
			if (inp[j] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}
