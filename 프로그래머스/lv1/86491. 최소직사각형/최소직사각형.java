class Solution {
    public int solution(int[][] sizes) {
        int max_w=0;
        int max_v=0;
        for(int i=0; i<sizes.length; i++){
            int w=Math.max(sizes[i][0],sizes[i][1]);
            int v=Math.min(sizes[i][0],sizes[i][1]);
            max_w=Math.max(max_w,w);
            max_v=Math.max(max_v,v);
        }
        return max_w*max_v;
    }
}