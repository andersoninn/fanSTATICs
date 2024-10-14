package gameManager;

//4. Classe Enemy
//   Classe para os inimigos, também herdando de GameObject. Eles se movem em direção ao jogador e causam dano.
public class Enemy extends GameObject {
    private Player player;

    public Enemy(int x, int y, Player player) {
        super(x, y, 40, 40);
        this.player = player;
    }

    @Override
    public void update() {
        // Mover em direção ao jogador
        if (x < player.x) x++;
        if (x > player.x) x--;
        if (y < player.y) y++;
        if (y > player.y) y--;
    }

    @Override
    public void render(Graphics g) {
        // Desenhar o inimigo na tela
        g.setColor(Color.RED);
        g.fillRect(x, y, width, height);
    }
}
