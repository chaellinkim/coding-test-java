import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for(int j=0; j<b; j++){
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                int c = Integer.parseInt(st2.nextToken());
                int d = Integer.parseInt(st2.nextToken());
            }
            System.out.println(a-1);
        }
    }
}
