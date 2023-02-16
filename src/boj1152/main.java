package boj1152;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.trim();
        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            String str[] = s.split(" ");
            System.out.println(str.length);
        }
    }

}
