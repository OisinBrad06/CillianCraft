import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
public class main 
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        JFrame window = new JFrame();
        window.setTitle("Oisin's Bizarre Adventure");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack();
        window.setVisible(true);
        window.setIconImage(gamePanel.sprite);

        JComponent root = window.getRootPane();
        root.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("SPACE"), "spacePressed");
       


    }
}