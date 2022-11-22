package q599;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		sc.close();

		// 2nd
		System.out.println(inp);
		System.out.println(inp.toUpperCase());
		String inp2 = inp.toUpperCase();
		for (int i = 0; i < inp2.length(); i++) {
			char c = inp2.charAt(i);
			if (Character.isAlphabetic(c)) {
				System.out.print(c);
			}
		}

		// 1st
//		for (int i = 0; i < inp.length(); i++) {
//			if (65 <= inp.charAt(i) && inp.charAt(i) <= 90) {
//				System.out.print(inp.charAt(i));
//			} else if (97 <= inp.charAt(i) && inp.charAt(i) <= 122) {
//				System.out.print((char)(inp.charAt(i) - 32));
//			}
//		}
	}
}
