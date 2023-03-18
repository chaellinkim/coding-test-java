import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0, min = 0, sum2 = 0, min2 = 0;

        /*for (int i = M; i <= N; i++) {
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
        }*/

        makePrime(N);

        for (int i = M; i <= N; i++) {
            if (prime[i] == false) {
                sum2 += i;
                if (min2 == 0) {
                    min2 = i;
                }
            }
        }
        if (sum2 == 0) {
            System.out.println(-1);
        } else {
            System.out.printf("%d\n%d\n", sum2, min2);
        }

    }

    public static void makePrime(int N) {
        prime = new boolean[N + 1];
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i < Math.sqrt(N); i++) {
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
