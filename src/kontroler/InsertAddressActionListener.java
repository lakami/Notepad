package kontroler;

import widok.Adres;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertAddressActionListener implements ActionListener {
    private JTextArea jTextArea;
    private Adres adres;

    public InsertAddressActionListener(JTextArea jTextArea, Adres adres) {
        this.jTextArea = jTextArea;
        this.adres = adres;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tekst = adres.getAdres();
        jTextArea.insert(tekst, jTextArea.getCaretPosition());
    }
}
