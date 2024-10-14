package gameManager;

//2. Classe GameObject
//   A superclasse que será usada para o jogador, inimigos e outros objetos do jogo. Ela terá métodos para posição, renderização e colisão.

public abstract class GameObject {
    protected int x, y;
    protected int width, height;

    public GameObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public abstract void update();
    public abstract void render(Graphics g);

    public boolean collidesWith(GameObject other) {
        return this.x < other.x + other.width &&
                this.x + this.width > other.x &&
                this.y < other.y + other.height &&
                this.y + this.height > other.y;
    }
}
