import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int max = nums.length/2;
        Set<Integer> hashset = new HashSet<>();
        for(int num : nums){
            hashset.add(num);
        }

        if(hashset.size()<max){
            return hashset.size();
        } else{
            return max;
        }
    }
    
}