package q616;

import java.util.Scanner;

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println(x + " " + y);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

class Triangle {
	private Point[] p;

	public Triangle(int[] param) {
		p = new Point[3];
		for (int i = 0, j = 0; i < p.length; i++, j += 2) {
			p[i] = new Point(param[j], param[j + 1]);
		}
	}

	public void print() {
		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}
	}

	public void getCoG() {
		int x = 0, y = 0;
		for (int i = 0; i < p.length; i++) {
			x += p[i].getX();
			y += p[i].getY();
		}
		System.out.printf("(%.1f, %.1f)\n", (double) x / 3, (double) y / 3);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] p = new int[6];
		for (int i = 0; i < p.length; i++) {
			p[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < p.length; i++) {
//			System.out.print(p[i] + " ");
//		}

		Triangle tri = new Triangle(p);
//		tri.print();
		tri.getCoG();
	}
}
