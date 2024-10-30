package io.codeForAll.fanSTATICs;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardInteraction implements KeyboardHandler {

    // Variables for player and grid interaction
    private Player player;
    private Grid field;

    // Constructor: links the player and grid to the keyboard handler
    public KeyboardInteraction(Player player, Grid field) {
        this.player = player;
        this.field = field;
    }

    // Handles key press events
    @Override
    public void keyPressed(KeyboardEvent e) {

        System.out.println("key is: " + e.getKey());
        switch (e.getKey()) {

            // Move player right
            case KeyboardEvent.KEY_RIGHT:
                player.moveRight();
                break;

            // Move player down
            case KeyboardEvent.KEY_DOWN:
                player.moveDown();
                break;

            // Move player left
            case KeyboardEvent.KEY_LEFT:
                player.moveLeft();
                break;

            // Move player up
            case KeyboardEvent.KEY_UP:
                player.moveUp();
                break;

            // Toggle paint/clear on space bar press
            case KeyboardEvent.KEY_SPACE:
                player.printClear();
                break;

        }
    }

    // Handles key release events (not implemented)
    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
