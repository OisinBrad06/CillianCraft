import javax.swing.*;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import java.awt.event.*;
public class main 
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        JFrame window = new JFrame();
        window.setTitle("Oisin's Bizarre Adventure");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel gamePanel = new GamePanel();
        JPanel panel = new JPanel();
        window.setContentPane(panel);
        window.add(gamePanel);
        window.pack();
        window.setVisible(true);
        window.setIconImage(gamePanel.sprite);

        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
             .put(KeyStroke.getKeyStroke("W"), "WPressed");
             panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
             .put(KeyStroke.getKeyStroke("A"), "APressed");
             panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
             .put(KeyStroke.getKeyStroke("S"), "SPressed");
             panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
             .put(KeyStroke.getKeyStroke("D"), "DPressed");

        panel.getActionMap().put("WPressed", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gamePanel.charY = gamePanel.charY - 4;
                gamePanel.repaint();
            }
        });
        panel.getActionMap().put("APressed", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Space was pressed!");
                gamePanel.charX = gamePanel.charX - 4;
                gamePanel.repaint();
            }
        });
        panel.getActionMap().put("SPressed", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gamePanel.charY = gamePanel.charY + 4;
                gamePanel.repaint();
            }
        });
        panel.getActionMap().put("DPressed", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gamePanel.charX = gamePanel.charX + 4;
                gamePanel.repaint();
            }
        });


    }
}