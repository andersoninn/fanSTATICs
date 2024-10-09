package io.codeforall.bootcamp.gfx.simplegfx;

import io.codeforall.bootcamp.gfx.lanterna.LanternaGridPosition;
import io.codeforall.bootcamp.grid.Grid;
import io.codeforall.bootcamp.grid.GridColor;
import io.codeforall.bootcamp.grid.GridDirection;
import io.codeforall.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Shape;

public class SimpleGfxGrid implements Grid {

    public static final int PADDING = 10;

    private int col;
    private int row;
    private int pixelCols;
    private int pixelRows;

    private int width;
    private int height;
    private Shape rectangle;


    public SimpleGfxGrid(int cols, int rows) {
        this.col = cols;
        this.row = rows;
        this.pixelCols = PADDING;
        this.pixelRows = PADDING;
        this.width = col * getCellSize();
        this.height = this.row * getCellSize();

    }

    /**
     * @see Grid#init()
     */
    @Override
    public void init() {
        rectangle = new Rectangle(PADDING, PADDING, this.getWidth(), this.getHeight());
        rectangle.draw();
    }

    /**
     * @see Grid#getCols()
     */
    @Override
    public int getCols() {
        return col;
    }

    /**
     * @see Grid#getRows()
     */
    @Override
    public int getRows() {
        return row;
    }

    /**
     * Obtains the width of the grid in pixels
     *
     * @return the width of the grid
     */
    public int getWidth() {
        return width;
    }

    /**
     * Obtains the height of the grid in pixels
     *
     * @return the height of the grid
     */
    public int getHeight() {
        return height;
    }

    /**
     * Obtains the grid X position in the SimpleGFX canvas
     *
     * @return the x position of the grid
     */
    public int getX() {
        return this.pixelCols;
    }

    /**
     * Obtains the grid Y position in the SimpleGFX canvas
     *
     * @return the y position of the grid
     */
    public int getY() {
        return this.pixelRows;
    }

    /**
     * Obtains the pixel width and height of a grid position
     *
     * @return
     */

    public int getCellSize() {
        return pixelRows + pixelCols;
    }

    /**
     * @see Grid#makeGridPosition()
     */
    @Override
    public GridPosition makeGridPosition() {
        return new SimpleGfxGridPosition(this);
    }

    /**
     * @see Grid#makeGridPosition(int, int)
     */
    @Override
    public GridPosition makeGridPosition(int col, int row) {
        return new SimpleGfxGridPosition(col, row, this);
    }

    /**
     * Auxiliary method to compute the y value that corresponds to a specific row
     *
     * @param row index
     * @return y pixel value
     */
    public int rowToY(int row) {
        return row * getCellSize() + PADDING;
    }

    /**
     * Auxiliary method to compute the x value that corresponds to a specific column
     *
     * @param column index
     * @return x pixel value
     */
    public int columnToX(int column) {
        return column * getCellSize() + PADDING;
    }

}
