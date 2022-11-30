package q542;

public class Main {
	public static void main(String[] args) {
		// 1. for-loop
		for (int i = 10; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 2. while-loop
		int j = 10;
		while (j <= 20) {
			System.out.print(j++ + " ");
		}
		System.out.println();

		// 3. do-while-loop
		int k = 10;
		do {
			System.out.print(k++ + " ");
		} while (k <= 20);
	}
}
