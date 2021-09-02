package widok;

import javax.swing.*;
import java.awt.*;

public class JRadioColorButton extends JRadioButtonMenuItem { //referencje do koloru ktorego jest przycisk
    private Color color;

    public Color getColor() {
        return color;
    }

    public JRadioColorButton(String text, Icon icon, Color color) {
        super(text, icon);
        this.color = color;

    }
}
