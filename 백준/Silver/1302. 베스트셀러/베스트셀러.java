import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int value,max=0;
        Map<String, Integer> map = new HashMap<>();
        String str2 = null;

        for(int i=0; i<n; i++){
            String str=br.readLine();
            value=map.getOrDefault(str,0)+1;
            map.put(str,value);
            if(max<=value){
                if(max==value){
                    if(str2.compareTo(str)>0){
                        str2 = str;
                    }
                }else {
                    max = value;
                    str2 = str;
                }
            }
        }
        System.out.println(str2);
        /*System.out.println("출력");
        for(Map.Entry<String,Integer> pair : map.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
        }*/
    }
}
