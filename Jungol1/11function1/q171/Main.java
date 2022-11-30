package q171;

import java.util.Scanner;

public class Main {
	public int sumFunc(int p) { // p = inp;
		int sum = 0;
		for (int i = 1; i <= p; i++) {
			sum += i;
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

//		System.out.println(inp);

		Main m = new Main();
		int ret = m.sumFunc(inp);
		System.out.println(ret);
	}
}
