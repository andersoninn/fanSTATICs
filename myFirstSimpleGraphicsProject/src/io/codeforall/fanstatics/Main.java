package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10, 1000, 1000);
        rectangle.setColor(Color.WHITE);
        rectangle.fill();

        Butterfly JorgFly = new Butterfly();
    }
}
