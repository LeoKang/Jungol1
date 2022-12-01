package q124;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		scan.close();
//		System.out.println(month);

		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("31");
			break;
		case 2:
			System.out.println("28");
			break;
		case 4, 6, 9, 11:
			System.out.println("30");
			break;
		}
	}
}
