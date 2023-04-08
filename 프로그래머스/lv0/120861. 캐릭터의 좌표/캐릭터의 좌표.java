class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int count1=0,count2=0;
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("up") && count1 < ((board[1] - 1) / 2)) {
                count1++;
                answer[1] = count1;
            } else if (keyinput[i].equals("down") && -count1 < ((board[1] - 1) / 2)) {
                count1--;
                answer[1] = count1;
            } else if (keyinput[i].equals("left") && -count2 < ((board[0] - 1) / 2)) {
                count2--;
                answer[0] = count2;
            } else if (keyinput[i].equals("right") && count2 < ((board[0] - 1) / 2)) {
                count2++;
                answer[0] = count2;
            }
        }
        
        return answer;
    }
}