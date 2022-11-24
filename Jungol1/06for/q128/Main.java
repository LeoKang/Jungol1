package q128;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		do {
			int inp = sc.nextInt();
			if (inp == 0) {
				break;
			} else if (inp % 3 != 0 && inp % 5 != 0) {
				cnt++;
			}
		} while (true);
		sc.close();
		System.out.println(cnt);
	}

}
