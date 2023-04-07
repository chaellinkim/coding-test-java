import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        int[] emergency2 = Arrays.copyOf(emergency,emergency.length);
        int[] answer = new int[emergency.length];
        Arrays.sort(emergency2);
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++)
                if(emergency[i]==emergency2[j]){
                    answer[i]=emergency.length-j;
                    break;
                }
        }
        return answer;
    }     
}