import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,1,2,3,2,4,2,5};
        int[] arr3={3,3,1,1,2,2,4,4,5,5};
        int count1=0;
        int count2=0;
        int count3=0;
        int j=0;
        for(int i=0; i<answers.length; i++){
            if(arr1[i%5]==answers[i]){
                count1++;
            }
            if(arr2[i%8]==answers[i]){
                count2++;
            }
            if(arr3[i%10]==answers[i]){
                count3++;
            }
        }
        int max=Math.max(count1, Math.max(count2,count3));
        List<Integer> list = new ArrayList<>();
        if(max==count1){
                list.add(1);
            }
        if(max==count2){
                list.add(2);
            }
        if(max==count3){
                list.add(3);
            }
        int[] answer=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}