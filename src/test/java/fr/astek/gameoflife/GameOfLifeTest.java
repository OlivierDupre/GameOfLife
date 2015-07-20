package fr.astek.gameoflife;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GameOfLifeTest {

    private final static int NB_ROWS = 4, NB_COLS = 8;

    private static GameOfLife gof;
    private static char[][] grid;

    @BeforeClass
    public static void setUpClass() {
        gof = new GameOfLife();

        grid = gof.init(NB_ROWS, NB_COLS);
        grid = gof.populate(grid);
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testPopulate() {
        char[][] expectedGrid = new char[][]{{'.', '.', '.', '.', '.', '.', '.', '.'},
                                            {'.', '.', '.', '.', '*', '.', '.', '.'},
                                            {'.', '.', '.', '*', '*', '.', '.', '.'},
                                            {'.', '.', '.', '.', '.', '.', '.', '.'}};

        Assert.assertArrayEquals(expectedGrid, grid);
    }

    @Test
    public void testGen2() {
        grid = gof.nextGen(grid);
        char[][] expectedGrid = new char[][]{{'.', '.', '.', '.', '.', '.', '.', '.'},
                                            {'.', '.', '.', '*', '*', '.', '.', '.'},
                                            {'.', '.', '.', '*', '*', '.', '.', '.'},
                                            {'.', '.', '.', '.', '.', '.', '.', '.'}};

        Assert.assertArrayEquals(expectedGrid, grid);
    }
    
    @Test
    public void testGen3() {
        grid = gof.nextGen(grid);
        char[][] expectedGrid = new char[][]{{'.', '.', '.', '.', '.', '.', '.', '.'},
                                            {'.', '.', '.', '*', '*', '.', '.', '.'},
                                            {'.', '.', '.', '*', '*', '.', '.', '.'},
                                            {'.', '.', '.', '.', '.', '.', '.', '.'}};

        Assert.assertArrayEquals(expectedGrid, grid);
    }
}
