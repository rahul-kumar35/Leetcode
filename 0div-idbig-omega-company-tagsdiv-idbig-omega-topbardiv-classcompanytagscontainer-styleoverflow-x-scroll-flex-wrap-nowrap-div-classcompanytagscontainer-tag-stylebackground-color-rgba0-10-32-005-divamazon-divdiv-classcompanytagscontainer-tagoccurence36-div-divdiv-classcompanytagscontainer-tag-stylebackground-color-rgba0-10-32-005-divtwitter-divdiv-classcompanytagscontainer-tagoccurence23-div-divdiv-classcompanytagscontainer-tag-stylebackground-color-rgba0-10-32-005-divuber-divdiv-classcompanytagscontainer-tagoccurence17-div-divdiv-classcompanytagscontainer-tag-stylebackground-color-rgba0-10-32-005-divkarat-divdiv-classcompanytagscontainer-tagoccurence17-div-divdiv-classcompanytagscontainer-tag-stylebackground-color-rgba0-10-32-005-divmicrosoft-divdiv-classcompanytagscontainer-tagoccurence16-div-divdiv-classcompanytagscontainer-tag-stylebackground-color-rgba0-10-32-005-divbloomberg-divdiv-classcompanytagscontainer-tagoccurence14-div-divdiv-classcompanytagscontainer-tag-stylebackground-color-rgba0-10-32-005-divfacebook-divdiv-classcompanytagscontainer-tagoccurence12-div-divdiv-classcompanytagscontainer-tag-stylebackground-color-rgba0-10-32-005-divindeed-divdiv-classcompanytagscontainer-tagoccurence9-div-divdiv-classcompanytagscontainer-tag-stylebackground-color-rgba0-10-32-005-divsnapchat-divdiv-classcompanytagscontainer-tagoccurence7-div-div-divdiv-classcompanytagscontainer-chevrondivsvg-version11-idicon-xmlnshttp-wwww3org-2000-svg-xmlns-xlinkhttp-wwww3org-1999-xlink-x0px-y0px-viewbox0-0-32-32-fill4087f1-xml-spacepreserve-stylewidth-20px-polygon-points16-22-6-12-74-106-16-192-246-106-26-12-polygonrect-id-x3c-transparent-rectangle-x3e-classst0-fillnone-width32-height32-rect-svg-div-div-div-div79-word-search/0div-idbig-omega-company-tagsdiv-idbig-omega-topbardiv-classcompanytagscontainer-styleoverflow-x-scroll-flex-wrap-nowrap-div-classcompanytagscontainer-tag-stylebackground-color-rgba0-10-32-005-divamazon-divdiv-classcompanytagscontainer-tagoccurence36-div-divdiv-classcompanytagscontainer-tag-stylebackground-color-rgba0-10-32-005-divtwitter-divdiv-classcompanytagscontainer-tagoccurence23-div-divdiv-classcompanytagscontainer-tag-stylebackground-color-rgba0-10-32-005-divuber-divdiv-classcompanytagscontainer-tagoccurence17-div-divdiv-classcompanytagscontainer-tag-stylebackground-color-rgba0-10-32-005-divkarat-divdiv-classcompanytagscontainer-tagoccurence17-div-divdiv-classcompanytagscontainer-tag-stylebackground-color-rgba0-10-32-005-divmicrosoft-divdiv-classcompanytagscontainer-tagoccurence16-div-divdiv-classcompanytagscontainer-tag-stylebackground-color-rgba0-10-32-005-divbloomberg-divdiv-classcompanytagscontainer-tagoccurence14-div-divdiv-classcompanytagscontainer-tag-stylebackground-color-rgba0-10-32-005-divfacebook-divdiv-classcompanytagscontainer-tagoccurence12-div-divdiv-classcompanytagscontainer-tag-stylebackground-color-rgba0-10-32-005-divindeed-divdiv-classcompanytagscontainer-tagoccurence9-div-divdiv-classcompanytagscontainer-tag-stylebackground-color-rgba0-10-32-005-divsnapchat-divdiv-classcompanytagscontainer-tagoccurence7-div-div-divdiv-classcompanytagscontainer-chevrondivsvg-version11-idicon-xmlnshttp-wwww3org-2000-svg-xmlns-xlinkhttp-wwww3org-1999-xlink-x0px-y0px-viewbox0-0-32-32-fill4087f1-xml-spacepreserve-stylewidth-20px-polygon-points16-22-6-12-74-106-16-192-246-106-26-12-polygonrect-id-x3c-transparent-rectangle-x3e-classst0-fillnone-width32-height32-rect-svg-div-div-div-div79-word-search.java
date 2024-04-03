class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(word.charAt(0) == board[i][j]){
                    if(search(0, i, j, board, word))
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean search(int index, int i, int j, char[][] board, String word){
        if(index >= word.length()) return true;
        if(i<0 || i>=board.length || j<0 || j>=board[0].length) return false;
        boolean ans = false;
        if(word.charAt(index)== board[i][j]){
            board[i][j] = '*';
            ans = search(index+1, i, j+1, board, word) ||
                  search(index+1, i+1, j, board, word) ||
                  search(index+1, i, j-1, board, word) ||
                  search(index+1, i-1, j, board, word);

            board[i][j] = word.charAt(index);             
        }
        return ans;
    }
}