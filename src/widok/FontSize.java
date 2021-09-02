package widok;

import widok.FontMenuItem;

import javax.swing.*;

public class FontSize extends JMenu {

    public FontSize(String s, int[] fontSize) {
        super(s);
        this.prepButtons(fontSize);
    }

    public void prepButtons(int[] fontSize) {
        for (int i  : fontSize) {

            FontMenuItem jMenuItem = new FontMenuItem(i);
            this.add(jMenuItem);
        }

    }

}
