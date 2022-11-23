package q576;

import java.util.Scanner;

public class Main {
	public int cal(int num1, char op, int num2) {
		int res = 0;

		switch (op) {
		case '+':
			res = num1 + num2;
			break;
		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			res = num1 / num2;
			break;
		}

		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		char op = sc.next().charAt(0);
		int n2 = sc.nextInt();
		sc.close();

		Main m = new Main();
		int r = m.cal(n1, op, n2);
		System.out.print(n1 + " " + op + " " + n2);
		System.out.println(" = " + r);
	}
}
