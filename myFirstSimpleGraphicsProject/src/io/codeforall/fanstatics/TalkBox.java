package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;

public class TalkBox extends KeyboardEvent {


    public TalkBox(){
        Rectangle talkBox = new Rectangle(0, 600, 600,200);
        talkBox.setColor(Color.WHITE);
        talkBox.fill();


        Rectangle talkBoxBorder = new Rectangle(10, 610, 580,180);
        talkBoxBorder.draw();

        Text initText= new Text(40 ,650, "Fale com o velho para responser aos enigmas..");
        initText.draw();

        Text interectText= new Text(40 ,680, "Pressione a barra de espaço para interagir!");
        interectText.draw();
    }
}
