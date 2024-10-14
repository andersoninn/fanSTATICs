package gameManager;

//7. Classe GameWorld
//   Gerencia todos os elementos do jogo, como o jogador, inimigos, projéteis, etc.
public class GameWorld {
    private Player player;
    private List<Enemy> enemies;

    public GameWorld() {
        player = new Player(100, 100);
        enemies = new ArrayList<>();
        spawnEnemies();
    }

    public void update() {
        player.update();
        for (Enemy enemy : enemies) {
            enemy.update();
            if (player.collidesWith(enemy)) {
                player.decreaseHealth();
            }
        }
    }

    public void render(Graphics g) {
        player.render(g);
        for (Enemy enemy : enemies) {
            enemy.render(g);
        }
    }

    private void spawnEnemies() {
        // Cria novos inimigos em posições aleatórias
        enemies.add(new Enemy(300, 300, player));
        enemies.add(new Enemy(500, 400, player));
        // Você pode adicionar mais lógica para spawnar inimigos com o tempo
    }
}

