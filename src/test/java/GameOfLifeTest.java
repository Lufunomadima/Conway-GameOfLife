import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameOfLifeTest {
    int[][] grid = {{0,0,1,1,1,0,0,0,0,0},
            {0,0,0,1,1,0,0,0,0,0},

    };

    @Test
    void nextGeneration() {
        assertEquals("++++++++++\n" +
                                "+++++#++++\n+" ,GameOfLife.nextGeneration(grid,2,10));
    }
}