package boj1075;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();

        int k = n % 100;
        n -=k;

        for (int i = 0; i <= 99; i++) {
            if ((n + i) % f == 0) {
                if (i < 10) {
                    System.out.printf("%02d",i);
                } else {
                    System.out.println(i);
                }
                break;
            }
        }
    }
}
