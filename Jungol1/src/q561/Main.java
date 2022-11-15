package q561;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < inp.length; i++) {
//			System.out.print(inp[i] + " ");
//		}

		int max = -1, min = 10000;
		for (int i = 0; i < inp.length; i++) {
			if (inp[i] > max && inp[i] < 100) {
				max = inp[i];
			}
			if (inp[i] < min && inp[i] >= 100) {
				min = inp[i];
			}
		}
		
		if(max == -1) {
			max = 100;
		}
		if(min == 10000) {
			min = 100;
		}
			
		System.out.println(max + " " + min);
	}
}
