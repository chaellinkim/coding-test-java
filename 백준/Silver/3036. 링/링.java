import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int gcd;
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int first= Integer.parseInt(st.nextToken());
        while(st.hasMoreTokens()){
            int other = Integer.parseInt(st.nextToken());
            gcd = gcd(first,other);
            sb.append(first/gcd).append("/").append(other/gcd).append("\n");
        }

        System.out.print(sb);

    }
    public static int gcd(int a, int b){
        int n = 0;
        while(b!=0){
            n = a%b;
            a = b;
            b = n;
        }
        return a;
    }
}
