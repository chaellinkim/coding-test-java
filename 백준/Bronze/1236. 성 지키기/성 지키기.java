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
        int count =0,count2= 0;
        boolean isrow = false;
        boolean iscol = false;
        String[] str = new String[x];

        for (int i = 0; i < x; i++) {
            str[i] = br.readLine();
        }

        for (int i = 0; i < x; i++) {
            isrow = false;

            for (int j = 0; j < y; j++) {
                if (String.valueOf(str[i].charAt(j)).equals("X")) {
                    isrow = true;
                }
            }
            if (isrow == false) {
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
        if(count>count2) {
            System.out.println(count);
        }else{
            System.out.println(count2);
        }
    }
}
