import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        int i=0;
        List<String> list= new ArrayList<>();
        for(String str : strings){
            list.add(str.charAt(n)+str);
        }
        Collections.sort(list);
        for(String str:list){
            answer[i]=str.substring(1);
            i++;
        }
        return answer;
    }
}