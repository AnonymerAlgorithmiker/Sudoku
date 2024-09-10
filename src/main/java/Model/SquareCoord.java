package Model;

public class SquareCoord{
    int outerSqCoord;
    int innerSqCoord;

    public SquareCoord(int outerSqCoord,int innerSqCoord){
        this.outerSqCoord =outerSqCoord;
        this.innerSqCoord =innerSqCoord;
    }

    public BoardCoord toBoardCoord(){
        int row = this.outerSqCoord - (this.outerSqCoord%3)+this.innerSqCoord/3;
        int column = (this.outerSqCoord%3) +(this.innerSqCoord%3);
        BoardCoord boardCoord = new BoardCoord(row,column);
        return boardCoord;
    }
    public int getOuterSqCoord() {
        return outerSqCoord;
    }

    public void setOuterSqCoord(int outerSqCoord) {
        this.outerSqCoord = outerSqCoord;
    }

    public int getInnerSqCoord() {
        return innerSqCoord;
    }

    public void setInnerSqCoord(int innerSqCoord) {
        this.innerSqCoord = innerSqCoord;
    }
}
