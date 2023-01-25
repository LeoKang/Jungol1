package q152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[10];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        sc.close();

//        for (int i = 0; i < ar.length; i++) {
//            System.out.print(ar[i] + " ");
//        }

        int odd = 0, even = 0;
        for (int i = 0; i < ar.length; i++) {
            if (i % 2 == 0) {
                odd += ar[i];
            } else {
                even += ar[i];
            }
        }
        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
    }
}
