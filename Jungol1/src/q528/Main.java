package q528;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		sc.close();

		if (n1 > 0) {
			System.out.println(n1);
		} else {
			System.out.println(n1 + "\nminus");
		}
	}
}