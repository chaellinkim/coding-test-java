import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int num = 666,count = 0;
        String str ="666";

        while(n!=count) {
            str = String.valueOf(num);
            if (str.contains("666")) {
                count++;
            }
            num++;
        }
        System.out.println(num-1);
    }
}
