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
    public GamePanel()
    {
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        try
        {
            sprite = ImageIO.read(new File("sprite.PNG"));
        }
        catch (IOException e)
        {
        }
        //this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (sprite != null) {
            g.drawImage(sprite, 100, 100, null);
        }
    }
}