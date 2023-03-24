import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str;
        int k;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            str = st.nextToken();
            
            if(str.equals("push")){
                k = Integer.parseInt(st.nextToken());
                stack.push(k);
            }else if(str.equals("pop")){
                if(stack.empty()){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.pop());
                }
            }else if(str.equals("size")){
                System.out.println(stack.size());
            }else if(str.equals("empty")){
                if(stack.empty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else{
                if(stack.empty()){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.peek());
                }
            }

        }
    }
}
