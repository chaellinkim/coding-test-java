//import.java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
        public String solution(String[] participant, String[] completion) {
            Map<String,Integer> map = new HashMap<>() ;
        int i=0;
        String answer = null;
        for( String player : participant) {
            map.put(player, map.getOrDefault(player,0)+1);
        }
        for( String player : completion) {
            map.put(player,map.get(player)-1);
        }
        for(String key : map.keySet()){
            if(map.get(key)!=0){
                answer = key;
            }
        }
        return answer;
        }
    }