package gameManager;

//5. Classe Weapon
//   Esta classe cuida dos ataques automáticos do jogador, como disparos de projéteis.
public class Weapon {
    private Player player;
    private List<Projectile> projectiles;
    private long lastShotTime;
    private int shotDelay = 500; // Meio segundo entre disparos

    public Weapon(Player player) {
        this.player = player;
        this.projectiles = new ArrayList<>();
        this.lastShotTime = System.currentTimeMillis();
    }

    public void update() {
        // Disparar projétil automaticamente
        if (System.currentTimeMillis() - lastShotTime >= shotDelay) {
            projectiles.add(new Projectile(player.x, player.y));
            lastShotTime = System.currentTimeMillis();
        }

        // Atualizar projéteis
        for (Projectile projectile : projectiles) {
            projectile.update();
        }
    }

    public void render(Graphics g) {
        for (Projectile projectile : projectiles) {
            projectile.render(g);
        }
    }
}
