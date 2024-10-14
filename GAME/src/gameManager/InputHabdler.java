package gameManager;

// 8. Classe InputHandler
// Gerencia as entradas do teclado.
public class InputHandler implements KeyListener {
    private static Set<Integer> keysPressed = new HashSet<>();

    @Override
    public void keyPressed(KeyEvent e) {
        keysPressed.add(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keysPressed.remove(e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    public static boolean isKeyPressed(int keyCode) {
        return keysPressed.contains(keyCode);
    }
}

