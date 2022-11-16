package q572;

import java.util.Scanner;

public class Main {
	double width;
//	double radius;

	public Main() {

	}

	public void circle(double radius) {
		this.width = radius * radius * 3.14;
		System.out.printf("%.2f", width);
//		return width;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		sc.close();

		Main c = new Main();
		c.circle(input);
	}
}