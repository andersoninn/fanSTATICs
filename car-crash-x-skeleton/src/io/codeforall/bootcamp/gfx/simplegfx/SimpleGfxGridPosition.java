package io.codeforall.bootcamp.gfx.simplegfx;

import io.codeforall.bootcamp.grid.GridDirection;
import io.codeforall.bootcamp.grid.position.AbstractGridPosition;
import io.codeforall.bootcamp.grid.position.GridPosition;
import io.codeforall.bootcamp.grid.GridColor;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Rectangle rectangle;
    private SimpleGfxGrid simpleGfxGrid;

    /**
     * Simple graphics position constructor
     *
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(SimpleGfxGrid grid) {
        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);
        show();

    }

    /**
     * Simple graphics position constructor
     *
     * @param col  position column
     * @param row  position row
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid) {
        super(col, row, grid);
        this.simpleGfxGrid = grid;
        rectangle = new Rectangle(grid.columnToX(col), grid.rowToY(row), simpleGfxGrid.getCellSize(), simpleGfxGrid.getCellSize());
        show();
    }

    /**
     * @see GridPosition#show()
     */
    @Override
    public void show() {
        rectangle.setColor(Color.BLUE);
        rectangle.fill();
    }


    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {
        rectangle.delete();
    }

    /**
     * @see GridPosition#moveInDirection(GridDirection, int)
     */
    @Override
    public void moveInDirection(GridDirection direction, int distance) {
       super.moveInDirection(direction, distance);
       rectangle.translate(simpleGfxGrid.columnToX(this.getCol()) - rectangle.getX(), simpleGfxGrid.rowToY(this.getRow()) - rectangle.getY());
/*
        int beforePosX = simpleGfxGrid.columnToX(this.getCol());
        int beforePosY = simpleGfxGrid.columnToX(this.getCol());

        super.moveInDirection(direction, distance);

        int afterPosX = simpleGfxGrid.columnToX(this.getCol());
        int afterPosY = simpleGfxGrid.columnToX(this.getCol());

       rectangle.translate(beforePosX- afterPosX, beforePosY - afterPosY);
 */ // gustavo implementation
    }

    /**
     * @see AbstractGridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) {
        super.setColor(color);
        rectangle.setColor(SimpleGfxColorMapper.getColor(color));
        }
}
