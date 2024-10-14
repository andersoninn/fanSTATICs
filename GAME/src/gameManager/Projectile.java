package gameManager;

//6. Classe Projectile
//   Projéteis disparados pela arma do jogador.
public class Projectile extends GameObject {
    private int speed = 10;

    public Projectile(int x, int y) {
        super(x, y, 10, 10);
    }

    @Override
    public void update() {
        // Movimento do projétil
        x += speed;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, width, height);
    }
}

