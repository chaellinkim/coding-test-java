import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        Character[] chars= new Character[s.length()];
        for(int i=0; i<s.length(); i++){
            chars[i]=s.charAt(i);
        }
        Arrays.sort(chars,Collections.reverseOrder());
        char[] charArray = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            charArray[i] = chars[i];
}
        return new String(charArray);
    }
}