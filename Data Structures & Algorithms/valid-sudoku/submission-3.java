class Solution {
    public boolean isValidSudoku(char[][] board) {
        int xLength = board.length;

        for(int i = 0; i < xLength; i++){
            Set<Character> lines = new HashSet<>();
            Set<Character> columns = new HashSet<>();
            for(int j = 0; j < xLength; j++){
                Set<Character> boxs = new HashSet<>();

                if((i == 0 && j == 0 ) || (i == 0 && j%3 == 0 && j>0) || (j == 0 && i%3 == 0 && i>0) || (i%3 == 0 && j%3 == 0 && i>0 && j>0)) {
                    for(int a = i; a < i+3; a++){
                        for(int b = j; b < j+3; b++){
                            if(board[a][b] != '.') {
                                if(boxs.contains(board[a][b])){
                                    return false;
                                }
                                boxs.add(board[a][b]);
                            }
                        }
                    }
                }

                if(board[i][j] != '.') {
                    if(lines.contains(board[i][j]))
                        return false;
                    lines.add(board[i][j]);
                }
                if(board[j][i] != '.') {
                    if(columns.contains(board[j][i]))
                        return false;
                    columns.add(board[j][i]);
                }
            }
        }
        return true;
    }
}