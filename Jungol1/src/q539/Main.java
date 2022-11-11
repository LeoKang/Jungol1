package q539;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int count = 0;
		int sum = 0;
		float avg = 0.0f;
		do {
			num = sc.nextInt();
			++count;
			sum += num;
		} while (num < 100);
		sc.close();
		avg = (float) sum / (float) count;
		System.out.printf("%d\n%.1f", sum, avg);
	}
}