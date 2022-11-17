package q615;

import java.util.Scanner;

class Student {
	private String name;
	private int kor;
	private int eng;

	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void print() {
		System.out.println(name + " " + kor + " " + eng);
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stu = new Student[2];
		for (int i = 0; i < stu.length; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			stu[i] = new Student(name, kor, eng);
		}
		sc.close();
		for (int i = 0; i < stu.length; i++) {
			stu[i].print();
		}

		int sumKor = 0, sumEng = 0;
		for (int i = 0; i < stu.length; i++) {
			sumKor += stu[i].getKor();
			sumEng += stu[i].getEng();
		}
		System.out.println("avg " + sumKor / stu.length
				+ " " + sumEng / stu.length);
	}
}
