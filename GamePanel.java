import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
public class GamePanel extends JPanel
{
    final int originalTileSize = 16; // 16x16 tile
    final int scale = 3;
    final int tileSize = originalTileSize * scale; // 48x48 tile
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;        
    final int screenWidth = tileSize * maxScreenCol; // 768 pixels
    final int screenHeight = tileSize * maxScreenRow;
    public BufferedImage sprite;
    boolean upPressed, downPressed, leftPressed, rightPressed;
    int charX = 100;
    int charY = 100;
    public GamePanel()
    {
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        try
        {
            sprite = ImageIO.read(new File("main/sprite.PNG"));
        }
        catch (IOException e)
        {
        }
        this.setDoubleBuffered(true);
        new Timer(16, e -> updateGame()).start();
    }
     private void updateGame() {
        int speed = 4;
        if (upPressed) charY -= speed;
        if (downPressed) charY += speed;
        if (leftPressed) charX -= speed;
        if (rightPressed) charX += speed;

        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (sprite != null) {
            g.drawImage(sprite, charX, charY, null);
        }
    }
}