package boj19532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int a;
    private static int b;
    private static int c;
    private static int d;
    private static int e;
    private static int f;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());
        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if (isAnswer(i, j)) {
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
    }

    private static boolean isAnswer(int x, int y) {
        return a * x + b * y == c && d * x + e * y == f;
    }
}
