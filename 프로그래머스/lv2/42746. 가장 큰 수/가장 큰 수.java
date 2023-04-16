import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        int i=0;
        String answer = "";
        for(int a :numbers){
            arr[i]=String.valueOf(a);
            i++;
        }
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        if(arr[0].equals("0")){
            return "0";
        }
        for(String str:arr){
            answer+=str;
        }
        return answer;
    }
}