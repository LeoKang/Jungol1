package q529;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int weight = sc.nextInt();
		sc.close();

		int x = weight + 100 - height;
		System.out.println(x);

		if (x > 0)
			System.out.println("1");
		System.out.println("2");
	}
}