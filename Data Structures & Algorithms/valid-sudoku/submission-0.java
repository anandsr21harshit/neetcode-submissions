class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // check each row

        for(int row=0;row<9;row++){
            Set<Character> visited = new HashSet<>();
            for(int i=0;i<9;i++){
                if(board[row][i] == '.') continue;
                if(!visited.add(board[row][i])) return false;
            }
        }
        // check each coloumn
        for(int col=0;col<9;col++){
            Set<Character> visited = new HashSet<>();
            for(int i=0;i<9;i++){
                if(board[i][col] == '.') continue;
                if(!visited.add(board[i][col])) return false;
            }
        }

        // check each grid
        for (int box = 0; box < 9; box++) {
            Set<Character> visited = new HashSet<>();

            int startRow = (box / 3) * 3;
            int startCol = (box % 3) * 3;

            for (int row = startRow; row < startRow + 3; row++) {
                for (int col = startCol; col < startCol + 3; col++) {

                    char digit = board[row][col];

                    if (digit == '.') continue;

                    if (!visited.add(digit)) return false;
                }
            }
        }
        return true;
    }
}
