package q523;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		//3rd ---------------------------------------------------
		System.out.print(n1 + " > " + n2 + " --- ");
		int r = (n1 > n2) ? 1 : 0;
		System.out.println(r);
		
		System.out.print(n1 + " < " + n2 + " --- ");
		r = (n1 < n2) ? 1 : 0;
		System.out.println(r);
		
		System.out.print(n1 + " >= " + n2 + " --- ");
		r = (n1 >= n2) ? 1 : 0;
		System.out.println(r);
		
		System.out.print(n1 + " <= " + n2 + " --- ");
		r = (n1 <= n2) ? 1 : 0;
		System.out.println(r);
		
		//2nd ---------------------------------------------------
//		System.out.print(n1 + " > " + n2 + " --- ");
//		if(n1 > n2)	System.out.println("1");
//		else 		System.out.println("0");
//		
//		System.out.print(n1 + " < " + n2 + " --- ");
//		if(n1 < n2)	System.out.println("1");
//		else 		System.out.println("0");
//		
//		System.out.print(n1 + " >= " + n2 + " --- ");
//		if(n1 >= n2)	System.out.println("1");
//		else 			System.out.println("0");
//		
//		System.out.print(n1 + " <= " + n2 + " --- ");
//		if(n1 <= n2)	System.out.println("1");
//		else 			System.out.println("0");
		
		// 1st --------------------------------------------------
//		System.out.println(n1 + " > " + n2 + " --- " + (n1 > n2));
//		System.out.println(n1 + " < " + n2 + " --- " + (n1 < n2));
//		System.out.println(n1 + " >= " + n2 + " --- " + (n1 >= n2));
//		System.out.println(n1 + " <= " + n2 + " --- " + (n1 <= n2));
	}
}
