package q170;

public class Main {
	public void printAt() {
		// 1st
//		System.out.println("@@@@@@@@@@");

		// 2nd
		for (int i = 0; i < 10; i++) {
			System.out.print("@");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Main m = new Main();
		// 1st
		System.out.println("first");
		m.printAt();
		System.out.println("second");
		m.printAt();
		System.out.println("third");
		m.printAt();

		// 2nd
		String[] str = { "first", "second", "third" };
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
			m.printAt();
		}
	}
}
