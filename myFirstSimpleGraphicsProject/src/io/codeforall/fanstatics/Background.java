package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Background{
    private Picture pictureBg;

    public Background(){
        pictureBg = new Picture(10, 10,"rsc/background.jpg" );
        pictureBg.draw();
    }
}
