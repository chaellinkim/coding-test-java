import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        int[] answer;
        Arrays.sort(arr2);
        if(arr.length==1){
            answer=new int[]{-1};
        }else{
            answer = new int[arr.length-1];
            for(int i=0,j=0; i<arr.length; i++,j++){
            if(arr2[0]!=arr[i]){
                answer[j]=arr[i];
            }else{
                j--;
            }
        }
        }
        
        return answer;
    }
}