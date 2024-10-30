package io.codeForAll.fanSTATICs;

import java.io.*;

public class Grid {

    // GRID creates a 2D array of frames (cells)
    public static final int PADDING = 10;

    private int cols;
    private int rows;
    private Frame[][] frames;

    // Constructor: sets the grid size and initializes it
    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        showField();
    }

    // Initializes the grid with frames at each position
    public void showField() {
        frames = new Frame[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                frames[i][j] = new Frame(i, j);
            }
        }
    }

    // Returns the number of columns
    public int getCols() {
        return cols;
    }

    // Returns the number of rows
    public int getRows() {
        return rows;
    }

    // Gets a specific cell (frame) at the given column and row
    public Frame getCell(int col, int row) {
        Frame c = frames[col][row];
        return c;
    }

    public Frame[][] getFrames() {
        return frames;
    }

}
