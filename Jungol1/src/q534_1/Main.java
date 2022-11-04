package q534_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();

//	      System.out.println(C);

		if (a.equals("A")) {	// a == "A"
			System.out.println("Excellent");
		} else if (a.equals("B")) {
			System.out.println("Good");
		} else if (a.equals("C")) {
			System.out.println("Usually");
		} else if (a.equals("D")) {
			System.out.println("Effort");
		} else if (a.equals("F")) {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		}

	}
}
