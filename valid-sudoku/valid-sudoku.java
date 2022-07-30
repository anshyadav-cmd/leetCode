class Solution {
    public  boolean isValidSudoku(char[][] board) {
        Set seem = new HashSet();

        for(int i = 0; i < 9 ; i++) {
            for(int j = 0; j < 9; j++) {
                char number = board[i][j];
                if(number != '.') {
                    String b = "(" + number + ")" ;
                    if(!seem.add(b + i) || !seem.add(j + b) || !seem.add(i/3 + b + j/3)){
                        return  false;
                    }
                }
            }
        }
        return true;
    }
}