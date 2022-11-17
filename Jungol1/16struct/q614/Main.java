package q614;

import java.util.Scanner;

class Student {
	private String schoolName;
	private int grade;

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void print() {
		System.out.println(grade + " grade in " + schoolName + " School");
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student stu1 = new Student();
		stu1.setSchoolName("Jejuelementary");
		stu1.setGrade(6);
		
		String schoolName = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		Student stu2 = new Student();
		stu2.setSchoolName(schoolName);
		stu2.setGrade(grade);

		stu1.print();
		stu2.print();
	}
}
