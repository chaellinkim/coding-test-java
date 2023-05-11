import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
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