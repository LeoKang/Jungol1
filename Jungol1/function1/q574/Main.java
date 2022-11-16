package q574;

import java.util.Scanner;

public class Main {
	public int maxFunc(int[] ar) {   // ar = inp;
		int max = -1;
		for (int i = 0; i < ar.length; i++) {
			if (max < ar[i]) {
				max = ar[i];
			}
		}

		return max;
	}

	public int maxFunc(int p1, int p2, int p3) {
		int max = 0;
		if (p1 > p2) {
			if (p1 > p3) {
				max = p1;
			} else {
				max = p3;
			}
		} else {
			if (p2 > p3) {
				max = p2;
			} else {
				max = p3;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[3];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < inp.length; i++) {
			System.out.print(inp[i] + " ");
		}

		Main m = new Main();
		int ret = m.maxFunc(inp);
		System.out.println(ret);
	}
}
