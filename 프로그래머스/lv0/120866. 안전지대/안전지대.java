class Solution {
    public int solution(int[][] board) {
        int answer = 0,x,y;
        int[][] boomBoard = new int[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j]==1){
                int[] xArr={0,-1,-1,-1,0,0,1,1,1};
                int[] yArr={0,-1,0,1,-1,1,-1,0,1};
        
                for(int k=0; k<9; k++){
                    x=i+xArr[k];
                    y=j+yArr[k];
                    if(x<boomBoard.length&&y<boomBoard.length&&x>=0&&y>=0){
                        boomBoard[x][y]=1;
                    }
                }
                }
            }
            }
            for(int i=0; i<boomBoard.length; i++){
            for(int j=0; j<boomBoard[i].length; j++){
                if(boomBoard[i][j]==0){
                    answer++;
                }
            }
        }
        return answer;
    }
}