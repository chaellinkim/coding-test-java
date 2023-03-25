import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> que = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[2];
        arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int index, halfIndex, count=0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] seq = new int[m];

        for(int i=1; i<=n; i++){
            que.add(i);
        }
        for(int i=0; i<m; i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<m; i++){
            index = que.indexOf(seq[i]);
            halfIndex = que.size()%2==0 ? que.size()/2-1 : que.size()/2;

            if(index<=halfIndex) {
                for(int j=0; j<index; j++){
                    int a = que.pollFirst();
                    que.addLast(a);
                    count++;
                }
            }else{
                for(int j=0; j<que.size()-index; j++){
                    que.addFirst(que.pollLast());
                    count++;
                }
            }
            que.pollFirst();
        }
        System.out.println(count);

    }
}
