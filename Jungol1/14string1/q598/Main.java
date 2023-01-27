package q598;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.printf("%d", (int)'A');
//        System.out.printf("%d", (int)'Z');

        //2nd Case
        while(true) {
            char inp = sc.next().charAt(0);

            if(Character.isAlphabetic(inp)) {
                System.out.println(inp);
            }else if (Character.isDigit(inp)) {
                System.out.printf("%d\n", (int) inp);
            }else{
                break;
            }
        }

        // 1st case
//        while (true) {
//            char inp = sc.next().charAt(0);
//
//            if (('A' <= inp && inp <= 'Z') || ('a' <= inp && inp <= 'z')) {
//                System.out.println(inp);
//            } else if ('0' <= inp && inp <= '9') {
//                System.out.printf("%d\n", (int) inp);
//            } else {
//                break;
//            }
//        }
    }
}
