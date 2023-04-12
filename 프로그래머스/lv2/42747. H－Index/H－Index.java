import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        int answer = 0, count;
        int max = Arrays.stream(citations).max().getAsInt();
        for(int n=0; n<max; n++){
            count=0;
            for(int j=0; j<citations.length; j++){
                if(n<=citations[j]){
                    count++;
                }
                if(n<=count&&n>=citations.length-count){
                    answer=Math.max(n,answer);
                }
            }
        }
        return answer;
    }
}