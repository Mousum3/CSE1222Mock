package q2;

import java.util.ArrayList;

public class Solution2 {
    private final int Row;
    private final int Col;
    private final String[][] grid;

    public Solution2(int Row, int Col) {
        this.Row = Row;
        this.Col = Col;
        this.grid = new String[Row][Col];
    }

    public void set(int row, int col, String description) {
        if (row >= 0 && row < Row && col >= 0 && col < Col) {
            grid[row][col] = description;
        }else{
            System.out.println("[" + row + "," + col + "]" + " index out of bounds! try again.");
        }
    }

    public String get(int row, int col) {
        if (row >= 0 && row < Row && col >= 0 && col < Col) {
            return grid[row][col];
        } else {
            return "[" + row + "," + col + "]" +" index out of bounds! try again.";
        }
    }

    public ArrayList<Cell> getDescribedCells() {
        ArrayList<Cell> describedCells = new ArrayList<>();
        for (int row = 0; row < Row; row++) {
            for (int col = 0; col < Col; col++) {
                if (grid[row][col] != null) {
                    describedCells.add(new Cell(row, col,grid[row][col]));
                }
            }
        }
        return describedCells;
    }

    
    class Cell {
        private int row;
        private int col;
        private String description;

        public Cell(int row, int col, String description) {
            this.row = row;
            this.col = col;
            this.description = description;
        }

        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public int getCol() {
            return col;
        }

        public void setCol(int col) {
            this.col = col;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "Cell[" + row + " , " + col + "] = " + description;
        }
    }
}
