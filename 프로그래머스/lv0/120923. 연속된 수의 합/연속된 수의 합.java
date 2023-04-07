class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int sum=0;
        for(int i=-total-num; i<total+num; i++){
            sum=0;
            for(int j=i; j<i+num; j++){
                sum+=j;
            }
            if(sum==total){
                for(int k=0; k<num; k++, i++){
                    answer[k]=i;
                }
                break;
            }
    }
        return answer;
    }
}