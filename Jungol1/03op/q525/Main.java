package q525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[3];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < inp.length; i++) {
//			System.out.print(inp[i] + " ");
//		}

		if (inp[0] > inp[1] && inp[0] > inp[2]) {
			System.out.print("1 ");
		} else {
			System.out.print("0 ");
		}

		if (inp[0] == inp[1] && inp[1] == inp[2]) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
