import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String,Integer> map = new HashMap<>();
        int value=0;
        for(String str : phone_book){
            map.put(str,value);
            value++;
        }
        for(int i=0; i<phone_book.length; i++){
            for(int j=1; j<phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0,j))){
                    answer = false;
                    return answer;
                }
            }
        }
        answer = true;
        return answer;
    }
}