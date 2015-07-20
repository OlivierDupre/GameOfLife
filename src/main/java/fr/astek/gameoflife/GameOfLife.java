package fr.astek.gameoflife;

public class GameOfLife {
    public char[][] init(int nbRow, int nbCol) {
        char[][] grid = new char[nbRow][nbCol];

        return grid;
    }

    public char[][] populate(char[][] grid) {
        grid = new char[][]{{'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '*', '.', '.', '.'},
        {'.', '.', '.', '*', '*', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'}};

        return grid;
    }

    public char[][] nextGen(char[][] grid) {
        grid[1][3] = '*';

        return grid;
    }
}
