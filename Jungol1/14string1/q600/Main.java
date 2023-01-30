package q600;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        sc.close();

        System.out.println(inp);

        int cnt = 1;
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == ' ') {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
