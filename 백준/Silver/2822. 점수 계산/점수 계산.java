
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[8];
        int[] arr2 = new int[5];
        int sum=0;
        Map<Integer,Integer> map = new HashMap<>();
        int score;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<8; i++){
            arr[i] = Integer.parseInt(br.readLine());
            map.put(arr[i],i);
        }
        Arrays.sort(arr);
        for(int i=7,j=0; i>2; i--,j++){
            sum+=arr[i];
            arr2[j]=map.get(arr[i])+1;
        }
        System.out.println(sum);
        Arrays.sort(arr2);
        for(int i=0; i<5; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
