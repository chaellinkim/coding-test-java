import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        Main main = new Main();
        int result = main.reverse(main.reverse(num1)+main.reverse(num2));
        System.out.println(result);
    }
    public int reverse(int num){
        int result =0;
        while(num>0){
            result = result*10+num%10;
            num/=10;
        }
        return result;
    }
}
