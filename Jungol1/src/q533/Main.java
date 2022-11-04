package q533;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//	      System.out.println('M'+0);
//	      System.out.println('F'+0);
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		int age = sc.nextInt();
		if (age >= 18) {
			switch (c) {
			case 77:
				System.out.println("MAN");
				break;
			case 70:
				System.out.println("WOMAN");
				break;
			}
		} else {
			switch (c) {
			case 70:
				System.out.println("GIRL");
				break;
			case 77:
				System.out.println("BOY");
				break;
			}
		}
		sc.close();
	}
}