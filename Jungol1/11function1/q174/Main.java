package q174;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] inp = new int[4][4];
        for (int i = 0; i < inp.length - 1; i++) {
            for (int j = 0; j < inp[i].length - 1; j++) {
                inp[i][j] = sc.nextInt();
            }
        }

//        for (int i = 0; i < inp.length; i++) {
//            for (int j = 0; j < inp[i].length; j++) {
//                System.out.printf("%3d ", inp[i][j]);
//            }
//            System.out.println();
//        }

        for (int i = 0; i < inp.length; i++) {
            int sum = 0;
            for (int j = 0; j < inp[i].length - 1; j++) {
                sum += inp[j][i];
            }
            inp[inp.length - 1][i] = sum;
        }

//        System.out.println("------------------");
//        for (int i = 0; i < inp.length; i++) {
//            for (int j = 0; j < inp[i].length; j++) {
//                System.out.printf("%3d ", inp[i][j]);
//            }
//            System.out.println();
//        }

        for (int i = 0; i < inp.length; i++) {
            int sum = 0;
            for (int j = 0; j < inp[i].length - 1; j++) {
                sum += inp[i][j];
            }
            inp[i][inp.length - 1] = sum;
        }

//        System.out.println("------------------");
        for (int i = 0; i < inp.length; i++) {
            for (int j = 0; j < inp[i].length; j++) {
                System.out.printf("%d ", inp[i][j]);
            }
            System.out.println();
        }
    }
}
