package q120;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

//		System.out.println(n1 + " " + n2);

		//2nd
		System.out.println(Math.abs(n1 - n2));
		
		//1st
		if (n1 > n2) {
			System.out.println(n1 - n2);
		} else {
			System.out.println(n2 - n1);
		}
	}

}
