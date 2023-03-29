import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        int max=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0; i<n; i++){
            max=Math.max(arr[i]*(i+1),max);
        }
        System.out.println(max);
    }
}
