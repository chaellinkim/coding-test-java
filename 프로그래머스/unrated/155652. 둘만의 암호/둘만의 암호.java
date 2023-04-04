class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char x;
        int count;
        for(int i=0; i<s.length(); i++){
            x=s.charAt(i);
            count=0;
            while(count<index){
                ++x;
                if(x>'z'){
                    x-=26;
                }
                if(skip.contains(x+"")){
                    continue;
                }else{
                    count++;
                }
            }
            answer+=x;
            
        }
        return answer;
    }
}