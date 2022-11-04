package q537;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		System.out.println(inp);

		// 1. for loop
		int sum = 0;
		for (int i = 1; i <= inp; i++) {
			sum = sum + i; // sum += i;
		}
		System.out.println(sum);

		// 2. while loop
		int sum1 = 0, j = 1;
		while (j <= inp) {
			sum1 += j;
			j++;
		}
		System.out.println(sum1);
		
		// 3. do ~ while loop
		int sum2 = 0, k = 1;
		do {
			sum2 += k++;
		}while(k <= inp);
		System.out.println(sum2);
	}
}
