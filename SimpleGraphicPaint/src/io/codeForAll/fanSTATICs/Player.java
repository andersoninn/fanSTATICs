package io.codeForAll.fanSTATICs;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Player {

    // Player variables for rectangle, frame, and grid field
    private Rectangle rectPlayer;
    private Frame framePlayer;
    private Grid field;

    // Constructor: initializes the player's frame, sets color, and binds it to the grid
    public Player(Grid field) {
        framePlayer = new Frame(10, 10);
        framePlayer.getFrame().setColor(Color.PINK);
        framePlayer.getFrame().fill();
        rectPlayer = framePlayer.getFrame();
        this.field = field;
    }

    // Move player to the right
    public void moveRight() {
        if (framePlayer.getCol() != field.getCols() - 1) {
            framePlayer.setCol(1);
            rectPlayer.translate(framePlayer.FRAME_SIZE, 0);
        }
    }

    // Move player to the left
    public void moveLeft() {
        if (framePlayer.getCol() != 0) {
            framePlayer.setCol(-1);
            rectPlayer.translate(-framePlayer.FRAME_SIZE, 0);
        }
    }

    // Move player up
    public void moveUp() {
        if (framePlayer.getRow() != 0) {
            framePlayer.setRow(-1);
            rectPlayer.translate(0, -framePlayer.FRAME_SIZE);
        }
    }

    // Move player down
    public void moveDown() {
        if (framePlayer.getRow() != field.getRows() - 1) {
            framePlayer.setRow(1);
            rectPlayer.translate(0, framePlayer.FRAME_SIZE);
        }
    }

    // Paint or clear the current cell
    public void printClear() {

        for (int i = 0; i < field.getFrames().length; i++) {
            for (int j = 0; j < field.getFrames().length; j++) {
                if (framePlayer.get == );
                    System.out.println(framePlayer.getCol() + "player");
                System.out.println(framePlayer.getRow() + "player");

            }
        }





    }
}
