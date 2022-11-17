package q575;

import java.util.Scanner;

public class Main {
	public int kpow(int a, int b) {
		// 2, 3 => 2 * 2 * 2
		int res = 2;
		for (int i = 1; i < b; i++) {
			res *= a;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		System.out.println(x + " " + y);
		Main m = new Main();
		System.out.println(m.kpow(x, y));

//		double ret = Math.pow(x, y);
//		System.out.println((int)ret);
	}
}
