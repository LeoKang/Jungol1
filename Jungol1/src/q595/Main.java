package q595;

public class Main {
	public static void main(String[] args) {
		String str = "Hong Gil Dong";
		System.out.print(str.charAt(3));
		System.out.print(str.charAt(4));
		System.out.print(str.charAt(5));
		System.out.print(str.charAt(6));
		System.out.println("------------------");
		for (int i = 3; i <= 6; i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println("------------------");
		System.out.println(str.substring(3, 7));
	}
}
