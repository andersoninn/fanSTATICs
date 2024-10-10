package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Char implements KeyboardHandler {

    private Keyboard keyboard;
    private Picture picture;
    private String name;
    boolean nextMove = false;
    boolean stopped = false;

    public Char(String name) {
        this.name = name;
        picture = new Picture(500, 500, "rsc/moveDown0.png");
        picture.draw();
        picture.grow(8,8);
        initKeyboard();
    }

    private void initKeyboard() {
        this.keyboard = new Keyboard(this);

        KeyboardEvent moveRight = new KeyboardEvent();
        moveRight.setKey(KeyboardEvent.KEY_RIGHT);
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveRight);

        KeyboardEvent moveLeft = new KeyboardEvent();
        moveLeft.setKey(KeyboardEvent.KEY_LEFT);
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveLeft);

        KeyboardEvent moveUp = new KeyboardEvent();
        moveUp.setKey(KeyboardEvent.KEY_UP);
        moveUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveUp);

        KeyboardEvent moveDown = new KeyboardEvent();
        moveDown.setKey(KeyboardEvent.KEY_DOWN);
        moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveDown);
    }

    private boolean changeMove() {
        return nextMove = !nextMove;
    }

    private boolean changeLegs() {
        return stopped = !stopped;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                if (stopped) {
                    picture.load("rsc/moveRight0.png");
                    changeLegs();
                    return;
                }
                if (!nextMove) {
                    picture.load("rsc/moveRight2.png");
                    picture.translate(10, 0);
                    changeMove();
                    changeLegs();
                    return;
                }
                picture.load("rsc/moveRight1.png");
                picture.translate(10, 0);
                changeMove();
                return;

            case KeyboardEvent.KEY_LEFT:
                if (stopped) {
                    picture.load("rsc/moveLeft0.png");
                    changeLegs();
                    return;
                }
                if (!nextMove) {
                    picture.load("rsc/moveLeft2.png");
                    picture.translate(-10, 0);
                    changeMove();
                    changeLegs();
                    return;
                }
                picture.load("rsc/moveLeft1.png");
                picture.translate(-10, 0);
                changeMove();
                return;

            case KeyboardEvent.KEY_UP:
                if (stopped) {
                    picture.load("rsc/moveUp0.png");
                    changeLegs();
                    return;
                }
                if (!nextMove) {
                    picture.load("rsc/moveUp2.png");
                    picture.translate(0, -10);
                    changeMove();
                    changeLegs();
                    return;
                }
                picture.load("rsc/moveUp1.png");
                picture.translate(0, -10);
                changeMove();
                return;

            case KeyboardEvent.KEY_DOWN:
                if (stopped) {
                    picture.load("rsc/moveDown0.png");
                    changeLegs();
                    return;
                }
                if (!nextMove) {
                    picture.load("rsc/moveDown2.png");
                    picture.translate(0, 10);
                    changeMove();
                    changeLegs();
                    return;
                }
                picture.load("rsc/moveDown1.png");
                picture.translate(0, 10);
                changeMove();
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
