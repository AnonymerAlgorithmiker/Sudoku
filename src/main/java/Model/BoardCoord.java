package Model;

public class BoardCoord{
    int column;
    int row;

    public BoardCoord(int column,int row){
        this.column=column;
        this.row=row;
    }

    public SquareCoord toSquareCoord(){
        int outerSqCoord = this.row-(this.row%3)+(this.column/3);
        int innerSqCoord = (this.row%3)*3+(this.column%3);
        SquareCoord squareCoord = new SquareCoord(outerSqCoord,innerSqCoord);
        return squareCoord;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
