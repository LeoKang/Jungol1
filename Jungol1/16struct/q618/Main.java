package q618;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] p = new Person[5];
		for (int i = 0; i < p.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			p[i] = new Person(name, height, weight);
		}
		sc.close();

//		for (int i = 0; i < p.length; i++) {
//			p[i].print();
//		}

		System.out.println("name");
		Arrays.sort(p, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				String w1 = o1.getName();
				String w2 = o2.getName();

				return w1.compareTo(w2);
			}
		});

		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}

		System.out.println("\nweight");
		Arrays.sort(p, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				double w1 = o1.getWeight();
				double w2 = o2.getWeight();

				if (w1 - w2 > 0)
					return -1;
				else if (w1 - w2 == 0)
					return 0;
				else
					return 1;
			}
		});

		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}
	}
}

class Person {
	private String name;
	private int height;
	private double weight;

	public Person(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void print() {
		System.out.println(name + " " + height + " " + weight);
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}
}