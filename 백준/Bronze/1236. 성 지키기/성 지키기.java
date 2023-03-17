import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int count =0,count2= 0,max=0;
        boolean iscol = false;
        String[] str = new String[x];

        for (int i = 0; i < x; i++) {
            str[i] = br.readLine();
                if (str[i].contains("X")==false) {
                    count++;
                }
        }
        for (int i = 0; i < y; i++) {
            iscol = false;
            for (int j = 0; j < x; j++) {
                if(String.valueOf(str[j].charAt(i)).equals("X")){
                    iscol = true;
                }
            }
            if(iscol == false){
                count2++;
            }
        }
        max = Math.max(count,count2);
        System.out.println(max);
    }
}
