package q1309;

import java.util.Scanner;

public class Main {
	// 1! = 1
	// n! = n * (n-1)!
	public static long factorial(int p) {
		System.out.print(p + "! = " + p);
		if (p == 1) {
			System.out.println();
			return 1;
		} else {
			System.out.println(" * " + (p - 1) + "!");
			return p * factorial(p - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

//		System.out.println(n);
		long ret = factorial(n);
		System.out.println(ret);
	}
}
