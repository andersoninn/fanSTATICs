

//1. Classe Game
//Esta é a classe principal que inicializa o jogo, cria o loop do jogo e gerencia as interações entre todos os outros componentes.


public class Game {
    private GameWorld gameWorld;
    private boolean running = true;

    public void start() {
        init();
        gameLoop();
    }

    private void init() {
        gameWorld = new GameWorld();
    }

    private void gameLoop() {
        while (running) {
            long startTime = System.nanoTime();

            // Atualizar o estado do jogo
            gameWorld.update();

            // Renderizar o jogo
            gameWorld.render();

            // Controlar o FPS
            long timeTaken = System.nanoTime() - startTime;
            long sleepTime = (1000000000 / 60) - timeTaken;

            if (sleepTime > 0) {
                try {
                    Thread.sleep(sleepTime / 1000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Game().start();
    }
}
