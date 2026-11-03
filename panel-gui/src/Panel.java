import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {


    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        // Text
        Color newColor = new Color(100,50,120);
        g.setColor(newColor);

        Font font = new Font("Arial", Font.BOLD, 30);
        g.setFont(font);

        g.drawString("Hello Java GUI", 50, 50);

        // Line
        g.drawLine(50, 70, 250, 70);

        // Rectangle
        g.drawRect(50, 100, 150, 80);

        // Filled Rectangle
        g.fillRect(250, 100, 150, 80);

        // Circle / Oval
        g.drawOval(50, 220, 100, 100);

        // Filled Circle
        g.fillOval(200, 220, 100, 100);
    }



}
