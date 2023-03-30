import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int a;
        Queue que = new LinkedList();
        sb.append("<");
        for(int i=0; i<n; i++){
            que.add(i+1);
        }
        while(que.size()!=1){
            for(int i=1; i<k; i++){
                que.offer((int) que.poll());
            }
            sb.append(que.poll()).append(", ");
        }
        sb.append(que.poll()).append(">");
        System.out.println(sb);
    }
}
