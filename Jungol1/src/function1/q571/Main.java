package function1.q571;

import java.util.Scanner;

public class Main {
	public static void printStr() {
		System.out.println("~!@#$^&*()_+|");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

//		System.out.println(num);
		for (int i = 0; i < num; i++) {
			printStr();
		}
	}
}
