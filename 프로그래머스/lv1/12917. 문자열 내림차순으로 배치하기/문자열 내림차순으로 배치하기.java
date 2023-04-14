import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
        Character[] chars= s.chars().mapToObj(i->(char)i).toArray(Character[]::new);
        Arrays.sort(chars,Collections.reverseOrder());
        
        return Arrays.stream(chars)
                   .map(c->c+"").collect(Collectors.joining());
    }
}