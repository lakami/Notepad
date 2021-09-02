package widok;

import javax.swing.*;
import java.awt.*;

public class FontMenuItem extends JMenuItem {

    private final int fontSize;

    public int getFontSize() {
        return fontSize;
    }

    public FontMenuItem(int fontSize) {
        super(fontSize + " pts");
        this.fontSize = fontSize;
        this.setFont(new Font(this.getFont().getName(), this.getFont().getStyle(), fontSize));
        //zmiana wielkosci fonta na wyswietlanych przyciskach
    }
}
