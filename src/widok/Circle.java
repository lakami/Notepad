package widok;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle implements Icon {

    Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D graphics2D = (Graphics2D) g;
        Ellipse2D.Double kropka = new Ellipse2D.Double(x, y, getIconWidth(), getIconHeight());
        graphics2D.setColor(color); // dodawanie koloru do obiektu
        graphics2D.fill(kropka); //kolorowanie kropki
    }

    @Override
    public int getIconWidth() {
        return 10;
    }

    @Override
    public int getIconHeight() {
        return 10;
    }
}
