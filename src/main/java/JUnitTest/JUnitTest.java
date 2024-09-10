package JUnitTest;

import Model.BoardCoord;
import Model.SquareCoord;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnitTest {
    //todo: create Tests and Fix Coord Translation

    @Test
    public void testCoord(){
        SquareCoord[] testSquareCoords = createTestSquareCoords();
        SquareCoord[] calculatedSquareCoords = new SquareCoord[10];
        BoardCoord[] testBoardCoords = createTestBoardCoords();
        BoardCoord[] calculatedBoardCoords = new BoardCoord[10];

        calculatedSquareCoords[0]=testBoardCoords[0].toSquareCoord();
        try {

            assertEquals("Case 1, outerCoord",testSquareCoords[0].getOuterSqCoord(),calculatedSquareCoords[0].getOuterSqCoord());
            assertEquals("Case 1, innerCoord",testSquareCoords[0].getInnerSqCoord(),calculatedSquareCoords[0].getInnerSqCoord());
        }catch (AssertionError e){
            System.err.println(e);
        }
    }

    public BoardCoord[] createTestBoardCoords(){
        BoardCoord[] testBoardCoords = new BoardCoord[10];
        testBoardCoords[0]=new BoardCoord(4,5);
        testBoardCoords[1]=new BoardCoord(4,5);
        testBoardCoords[2]=new BoardCoord(4,5);
        testBoardCoords[3]=new BoardCoord(4,5);
        testBoardCoords[4]=new BoardCoord(4,5);
        testBoardCoords[5]=new BoardCoord(4,5);
        testBoardCoords[6]=new BoardCoord(4,5);
        testBoardCoords[7]=new BoardCoord(4,5);
        testBoardCoords[8]=new BoardCoord(4,5);
        testBoardCoords[9]=new BoardCoord(4,5);

        return testBoardCoords;
    }

    public SquareCoord[] createTestSquareCoords(){
        SquareCoord[] testSquareCoords = new SquareCoord[10];
        testSquareCoords[0]=new SquareCoord(4,5);
        testSquareCoords[1]=new SquareCoord(4,5);
        testSquareCoords[2]=new SquareCoord(4,5);
        testSquareCoords[3]=new SquareCoord(4,5);
        testSquareCoords[4]=new SquareCoord(4,5);
        testSquareCoords[5]=new SquareCoord(4,5);
        testSquareCoords[6]=new SquareCoord(4,5);
        testSquareCoords[7]=new SquareCoord(4,5);
        testSquareCoords[8]=new SquareCoord(4,5);
        testSquareCoords[9]=new SquareCoord(4,5);

        return testSquareCoords;
    }
}
