package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Butterfly implements KeyboardHandler {

    private Picture picture;
    private double initX;
    private double initY;

    private Keyboard keyboard;

    public Butterfly() {
        this.initX = Math.random();
        this.initY = Math.random();

        this.picture = new Picture(0, 0, "rsc/butterfly.jpg");
        picture.draw();

        initKeyboard();
    }

    private void initKeyboard() {
        this.keyboard = new Keyboard(this);

        KeyboardEvent createJorgFly = new KeyboardEvent();
        createJorgFly.setKey(KeyboardEvent.KEY_SPACE);
        createJorgFly.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(createJorgFly);


    }

    private void getMovement(){
        int move = (int) Math.random() * 4;
        switch (move) {
            case 1:
                picture.translate(initX++, 0);
                break;
            case 2:
                picture.translate(0, initY++);
                break;
            case 3:
                picture.translate(initX--, 0);
                break;
            case 4:
                picture.translate(0, initY--);
                break;
        }
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
           

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
