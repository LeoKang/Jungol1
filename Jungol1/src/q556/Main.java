package q556;

public class Main {
	public static void main(String[] args) {
		int ar1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}
		System.out.println();

		int ar2[] = new int[10];
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = i + 1;
		}
		for (int i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + " ");
		}
	}
}
