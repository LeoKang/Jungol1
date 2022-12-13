package q9027;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inp1 = sc.nextDouble();
		double inp2 = sc.nextDouble();
		sc.close();

		System.out.println(inp1 + " " + inp2);
		// 1.
		int ret1 = (int) (inp1 + inp2);

		// 2.
		int ret2 = (int) inp1 + (int) inp2;

		System.out.println(ret1 + " " + ret2);
	}
}
