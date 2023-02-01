package Beginner1.q1307;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

//        System.out.println(n);

        int[][] ar = new int[n][n];
        int cnt = 1;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = cnt++;
            }
        }

//        for (int i = 0; i < ar.length; i++) {
//            for (int j = 0; j < ar[i].length; j++) {
//                System.out.print(ar[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("---------------------");

        for (int i = ar.length-1; i >=0; i--) {
            for (int j = ar[i].length-1; j >=0; j--) {
//                System.out.print(ar[j][i] + " ");
                System.out.printf("%c ", ar[j][i] + 64);
            }
            System.out.println();
        }
    }
}
