package io.codeForAll.fanSTATICs;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Frame {

    // Creates a "base frame" to be inserted into the grid array
    public static final int FRAME_SIZE = 50; // AKA Cellsize

    private Rectangle rectFrame;
    private int col;
    private int row;
    private boolean painted;

    // Constructor: initializes the frame's position and draws the rectangle
    public Frame(int col, int row) {
        this.col = col;
        this.row = row;
        this.painted = false;
        rectFrame = new Rectangle(row * FRAME_SIZE + Grid.PADDING, col * FRAME_SIZE + Grid.PADDING, FRAME_SIZE, FRAME_SIZE);
        rectFrame.draw();
    }

    // Returns the size of each cell (frame)
    public int getCellsize() {
        return FRAME_SIZE;
    }

    // Returns the rectangle representing the frame
    public Rectangle getFrame() {
        return rectFrame;
    }

    // Returns the column position
    public int getCol() {
        return col;
    }

    // Returns the row position
    public int getRow() {
        return row;
    }

    // Updates the column position
    public void setCol(int num) {
        col += num;
    }

    // Updates the row position
    public void setRow(int num) {
        row += num;
    }

    // Fills the frame (paints)
    public void paint() {
        rectFrame.fill();
        painted = true;
    }

    // Draws the frame (erases fill)
    public void erase() {
        rectFrame.draw();
        painted = false;
    }

    public boolean isPainted() {
        return this.painted;
    }
}
