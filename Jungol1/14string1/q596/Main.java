package q596;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		int n = sc.nextInt();
		sc.close();

//		System.out.println(inp);
//		System.out.println(n);

		for (int i = inp.length() - 1; (n > 0 && i >= 0); i--, n--) {
			System.out.print(inp.charAt(i));
		}
	}
}
