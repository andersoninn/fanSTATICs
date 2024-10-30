package io.codeForAll.fanSTATICs;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;

public class SystemControl {

    // Declare grid, player, and keyboard interaction
    public Grid field;
    public Player player;
    public int gridFrame;
    private KeyboardInteraction KInteraction;

    // Constructor: initializes grid, player, and sets up keyboard interaction
    public SystemControl() {
        field = new Grid(15, 15);
        player = new Player(field);
        KInteraction = new KeyboardInteraction(player, field);
        keyboardPresses();
    }

    // Sets up keyboard events for movement and other controls
    public void keyboardPresses() {

        Keyboard k = new Keyboard(KInteraction);

        // Move right
        KeyboardEvent eventRight = new KeyboardEvent();
        eventRight.setKey(KeyboardEvent.KEY_RIGHT);
        eventRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventRight);

        // Move left
        KeyboardEvent eventLeft = new KeyboardEvent();
        eventLeft.setKey(KeyboardEvent.KEY_LEFT);
        eventLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventLeft);

        // Move up
        KeyboardEvent eventUp = new KeyboardEvent();
        eventUp.setKey(KeyboardEvent.KEY_UP);
        eventUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventUp);

        // Move down
        KeyboardEvent eventDown = new KeyboardEvent();
        eventDown.setKey(KeyboardEvent.KEY_DOWN);
        eventDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventDown);

        // Paint/clean frame section
        KeyboardEvent eventPrintClean = new KeyboardEvent();
        eventPrintClean.setKey(KeyboardEvent.KEY_SPACE);
        eventPrintClean.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventPrintClean);

        // Clear the entire screen
        KeyboardEvent eventCleanAll = new KeyboardEvent();
        eventCleanAll.setKey(KeyboardEvent.KEY_C);
        eventCleanAll.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventCleanAll);

        // Save the project
        KeyboardEvent eventSave = new KeyboardEvent();
        eventSave.setKey(KeyboardEvent.KEY_S);
        eventSave.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventSave);

        // Load the saved frame
        KeyboardEvent eventReprint = new KeyboardEvent();
        eventReprint.setKey(KeyboardEvent.KEY_L);
        eventReprint.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventReprint);
    }
}
