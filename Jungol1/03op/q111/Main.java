package q111;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[4];
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		sc.close();

		int sum = 0;
		for (int i = 0; i < score.length; i++) {
//			System.out.print(score[i] + " ");
			sum += score[i];
		}
		System.out.println("sum " + sum);
		System.out.println("avg " + sum / score.length);

	}

}
