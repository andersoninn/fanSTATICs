package gameManager;

import java.awt.*;

//10. Classe HUD
// Gerencia a interface de usuário (vida, pontuação).
public class ControlStatus {
    public void render(Graphics g, Player player) {
        // Desenhar barra de vida
        g.setColor(Color.GREEN);
        g.fillRect(10, 10, player.getHealth() * 2, 20);
        g.setColor(Color.BLACK);
        g.drawString("Vida: " + player.getHealth(), 10, 40);
    }
}

