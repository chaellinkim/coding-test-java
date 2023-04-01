class Solution {
    public int[] solution(int n) {
        int count=0;
        int i=0, j=0;
        while(i++<=n){
        if(n%i==0){
            count++;
        }
    }
        i=0;
        int[] answer = new int[count];
        
        while(i++<=n){
        if(n%i==0){
            answer[j]=i;
            j++;
        }
    }
        return answer;
    }
}