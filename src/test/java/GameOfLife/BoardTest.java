package GameOfLife;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BoardTest {



    @Test
    public void countCellsTest(){
        Board board = new Board();
        board.addCell(0,0);
        board.addCell(0,1);
        Assertions.assertEquals(2, board.countCells());
    }


}
