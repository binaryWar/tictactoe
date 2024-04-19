package TicTacToe.Models;

import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> grid;
    public Board(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getGrid() {
        return grid;
    }

    public void setGrid(List<List<Cell>> grid) {
        this.grid = grid;
    }
}
