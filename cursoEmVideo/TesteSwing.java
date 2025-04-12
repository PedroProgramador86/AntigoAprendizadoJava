import javax.swing.*;

public class TesteSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Exemplo");
        JLabel label = new JLabel("Olá, Swing!", SwingConstants.CENTER);
        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}