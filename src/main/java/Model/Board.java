package Model;

public class Board {
    public static final int length = 9;
    public static final int height = 9;

    //Values of -1 signals a undefined Value for a Square
    private int[][] board = new int[length][height];

    //initiates the board with -1 on every Square
    private void initiateEmptyBoard(){
        for(int x=0;x<length;x++){
            for(int y=0;y<height;y++){
                board[x][y]=-1;
            }
        }
    }

    private void initiateBoard(int[][] newBoard){
        for(int x=0;x<length;x++){
            for(int y=0;y<height;y++){
                board[x][y]=newBoard[x][y];
            }
        }
    }

    //sets value for a Square if it is previously undefined
    private void setSquare(int newValue, int x, int y){
        if(x<0 || y<0){
            System.out.println("Only positive Coordinates allowed");
            return;
        }
        if(newValue<0) {
            System.out.println("Only Positive Values allowed");
            return;
        }
        if(board[x][y] != -1){
            System.out.println("The Value of this Square has already been set");
            return;
        }else{
            board[x][y] = newValue;
        }
    }

    //forcefully overrides Value of Square
    private void fSetSquare(int newValue, int x, int y){
        if(x<0 || y<0){
            System.out.println("Only positive Coordinates allowed");
            return;
        }
        board[x][y] = newValue;
    }
}
