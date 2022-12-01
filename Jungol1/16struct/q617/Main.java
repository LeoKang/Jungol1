package q617;

import java.util.Scanner;

class Person {
	private String name;
	private int height;

	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public void print() {
		System.out.println(name + " " + height);
	}

	public int getHeight() {
		return height;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] person = new Person[5];
		for (int i = 0; i < person.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			person[i] = new Person(name, height);
		}
		sc.close();

//		for (int i = 0; i < person.length; i++) {
//			person[i].print();
//		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < person.length; i++) {
			if (min > person[i].getHeight()) {
				min = person[i].getHeight();
			}
		}

		for (int i = 0; i < person.length; i++) {
			if(min == person[i].getHeight()) {
				person[i].print();
			}
		}
	}
}
