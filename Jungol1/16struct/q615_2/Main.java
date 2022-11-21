package q615_2;

import java.util.Scanner;

class Score {
	Scanner sc = new Scanner(System.in);
	private Student[] stu;

	public Score() {
		stu = new Student[2];
		for (int i = 0; i < stu.length; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			stu[i] = new Student(name, kor, eng);
		}

		for (int i = 0; i < stu.length; i++) {
			stu[i].print();
		}
	}

	public int getAvgKor() {
		int sum = 0;
		for (int i = 0; i < stu.length; i++) {
			sum += stu[i].getKor();
		}
		return sum / stu.length;
	}

	public int getAvgEng() {
		int sum = 0;
		for (int i = 0; i < stu.length; i++) {
			sum += stu[i].getEng();
		}
		return sum / stu.length;
	}

	public void printAvg() {
		System.out.println("avg " + getAvgKor() + " " + getAvgEng());
	}
}

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
		Score sco = new Score();
		sco.printAvg();
	}
}
