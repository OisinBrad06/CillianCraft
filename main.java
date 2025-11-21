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
        keybindSetup(gamePanel, panel);
    }
        public static void keybindSetup(GamePanel gamePanel, JPanel panel)
        {
            panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
             .put(KeyStroke.getKeyStroke("pressed W"), "WPressed");
              panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
             .put(KeyStroke.getKeyStroke("released W"), "WReleased");
             panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
             .put(KeyStroke.getKeyStroke("pressed A"), "APressed");
             panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
             .put(KeyStroke.getKeyStroke("released A"), "AReleased");
             panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
             .put(KeyStroke.getKeyStroke("pressed S"), "SPressed");
              panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
             .put(KeyStroke.getKeyStroke("released S"), "SReleased");
             panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
             .put(KeyStroke.getKeyStroke("pressed D"), "DPressed");
             panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
             .put(KeyStroke.getKeyStroke("released D"), "DReleased");

            panel.getActionMap().put("WPressed", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    gamePanel.upPressed = true;
                }
            });
            panel.getActionMap().put("APressed", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    gamePanel.leftPressed = true;
                }
            });
            panel.getActionMap().put("SPressed", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    gamePanel.downPressed = true;
                }
            });
            panel.getActionMap().put("DPressed", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    gamePanel.rightPressed = true;
                }
            });
            panel.getActionMap().put("WReleased", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    gamePanel.upPressed = false;
                }
            });
           panel.getActionMap().put("AReleased", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    gamePanel.leftPressed = false;
                }
            });
            panel.getActionMap().put("SReleased", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    gamePanel.downPressed = false;
                }
            });
            panel.getActionMap().put("DReleased", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    gamePanel.rightPressed = false;
                }
            });
        }
}