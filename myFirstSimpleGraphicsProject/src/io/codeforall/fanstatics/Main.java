package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Shape;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {
    public static void main(String[] args) {

        Canvas.limitCanvasHeight(580);
        Canvas.limitCanvasWidth(580);

        Rectangle rectangle = new Rectangle(0, 0, 590, 600);
        rectangle.setColor(Color.WHITE);
        rectangle.fill();


        Background bgPattern = new Background();
       // TalkBox talkBox = new TalkBox();

        Char char1 = new Char("Gon");

    }
}
