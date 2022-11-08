package q557;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] carr = new char[10];

		for (int i = 0; i < carr.length; i++) {
			String s = sc.next();
			carr[i] = s.charAt(0);
//			carr[i] = sc.next().charAt(0);
		}
		sc.close();

//		for (int i = 0; i < carr.length; i++) {
//			System.out.print(carr[i] + " ");
//		}

		System.out.println(carr[0]
				+ " " + carr[3] + " " + carr[6]);
	}
}
