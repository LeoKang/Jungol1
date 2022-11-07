package q521;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inp1 = scan.nextInt();
		int inp2 = scan.nextInt();
		scan.close();

//		System.out.println(inp1 + " " + inp2);

		int res = inp1++ * --inp2;
		System.out.println(inp1 + " " + inp2 + " " + res);
	}
}
