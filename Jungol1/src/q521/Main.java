package q521;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		num1++;
		System.out.print(num1 + " ");

		--num2;
		System.out.print(num2 + " ");

		num1 = num1 - 1;
		System.out.print(num1 * num2);
	}
}