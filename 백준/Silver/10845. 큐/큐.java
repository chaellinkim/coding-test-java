import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String str;
        int k;
        Deque<Integer> que = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            str = st.nextToken();
            switch (str) {
                case "push":
                    k = Integer.parseInt(st.nextToken());
                    que.offer(k);
                    break;
                case "pop":
                    sb.append(que.isEmpty() ? -1:que.poll()).append('\n');
                    break;
                case "size":
                    sb.append(que.size()).append('\n');
                    break;
                case "empty":
                    sb.append(que.isEmpty() ? 1:0).append('\n');
                    break;
                case "front":
                    sb.append(que.isEmpty() ? -1:que.peek()).append('\n');
                    break;
                case "back":
                    sb.append(que.isEmpty() ? -1:que.peekLast()).append('\n');
                    break;
            }
        }
        System.out.print(sb);
    }
}
