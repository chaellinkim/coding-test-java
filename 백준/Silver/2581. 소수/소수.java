import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0, min = 0;

        for (int i = M; i <= N; i++) {
            for (int j = 2; j <= i; j++) {
                if (i == j) {
                    sum += i;
                    if (min == 0) {
                        min = i;
                    }
                }
                if (i % j == 0) {
                    break;
                }

            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.printf("%d\n%d", sum, min);
        }
    }
}
