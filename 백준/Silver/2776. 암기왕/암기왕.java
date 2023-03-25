import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t>0){
            Set<Integer> set = new HashSet<>();
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                set.add(Integer.parseInt(st.nextToken()));
            }
            int m = Integer.parseInt(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            while(st2.hasMoreTokens()){
                String str = st2.nextToken();
                if(set.contains(Integer.parseInt(str))){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }
            t--;
        }
        System.out.println(sb);
    }
}
