package q113;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		sc.close();

		w = w + 5;
		h = 2 * h;
		System.out.println("width = " + w);
		System.out.println("length = " + h);
		System.out.println("area = " + (w * h));
	}
}
