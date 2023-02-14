package boj1037;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (n-- > 0) {
            int k = in.nextInt();
            min = k < min ? k : min;
            max = k > max ? k : max;
        }
        System.out.println(min * max);

    }
}
