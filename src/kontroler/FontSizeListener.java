package kontroler;

import widok.FontMenuItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontSizeListener implements ActionListener {

    private FontMenuItem fontMenuItem;
    private JLabel jLabel;
    private JTextArea jTextArea;

    public FontSizeListener(FontMenuItem fontMenuItem, JLabel jLabel, JTextArea jTextArea) {
        this.fontMenuItem = fontMenuItem;
        this.jLabel = jLabel;
        this.jTextArea = jTextArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int size = fontMenuItem.getFontSize(); //pobieram size z kloknietego elementu
        jLabel.setText(size + ""); // ustawiam labelkę

        Font font = jTextArea.getFont(); //pobierma fonta
        jTextArea.setFont(new Font(font.getName(), font.getStyle(), size));

    }
}
