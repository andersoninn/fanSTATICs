package gameManager;


//3. Classe Player
//   A classe que representa o jogador, herdando de GameObject. Ela lidará com o movimento e o uso de armas.
public class Player extends GameObject {
    private int health;
    private Weapon weapon;

    public Player(int x, int y) {
        super(x, y, 50, 50); // Tamanho arbitrário
        this.health = 100;
        this.weapon = new Weapon(this); // Passa o jogador para a arma
    }

    @Override
    public void update() {
        // Atualiza movimento e arma
        handleInput();
        weapon.update();
    }

    private void handleInput() {
        // Movimento do jogador com base nas entradas
        if (InputHandler.isKeyPressed(KeyEvent.VK_UP)) {
            y -= 5;
        }
        if (InputHandler.isKeyPressed(KeyEvent.VK_DOWN)) {
            y += 5;
        }
        if (InputHandler.isKeyPressed(KeyEvent.VK_LEFT)) {
            x -= 5;
        }
        if (InputHandler.isKeyPressed(KeyEvent.VK_RIGHT)) {
            x += 5;
        }
    }

    @Override
    public void render(Graphics g) {
        // Desenhar o jogador na tela
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }

    public void decreaseHealth() {
        health -= 10;
    }

    public int getHealth() {
        return health;
    }
}
