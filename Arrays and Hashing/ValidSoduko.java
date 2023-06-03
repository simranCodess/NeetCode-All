import java.util.*;
public class ValidSoduko{
    public boolean isValidSudoku(char [] [] board){
        HashSet<String> seen= new HashSet<String>();
        for(int i=0; i<9 ;i++){
            for(int j=0; j<9; j++){
                if(board[i][j]!='.') { //only checking if valid entry in the box
                    //formulae to calculate box number
                    int boxNum = (i / 3) * 3 + (j / 3);
                    if (!seen.add("ROW" + i + board[i][j]) || !seen.add("COL" + j + board[i][j]) || !seen.add("BOX" + boxNum + board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
