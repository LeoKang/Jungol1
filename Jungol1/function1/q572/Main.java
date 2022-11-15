package q572;

import java.util.Scanner;

public class Main {
	public double calcArea(int r) {
		double area = r * r * 3.14;
		return area;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();

//		System.out.println(r);
		Main m = new Main();
		double ret = m.calcArea(r);
		System.out.printf("%.2f\n", ret);
	}
}
