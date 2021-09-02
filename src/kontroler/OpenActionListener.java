package kontroler;

import model.Model;
import widok.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class OpenActionListener implements ActionListener {
    private View view;
    private Model model;
    private JFileChooser jFileChooser;

    public OpenActionListener(View view, Model model, JFileChooser jFileChooser) {
        this.view = view;
        this.model = model;
        this.jFileChooser = jFileChooser;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var result = jFileChooser.showOpenDialog(view); // otwieram okno otwierania jFileChoosera
        //metoda showOpenDialog zwróci w miejsce wywołania wynik
        //wynik zależny jest od teho jaki przycisk zostal wybrany w jFileChooser
        if (result == JFileChooser.APPROVE_OPTION){
            File file = jFileChooser.getSelectedFile();
            StringBuffer stringBuffer = new StringBuffer();

            try {
                Scanner scanner = new Scanner(file);
                boolean czyTojestPierwszaLinia = true;
                while (scanner.hasNextLine()){
                    if (czyTojestPierwszaLinia){
                        czyTojestPierwszaLinia = false;
                    }
                    else {
                        stringBuffer.append("\n");
                    }
                    stringBuffer.append(scanner.nextLine());
                }

                view.getMp().getjTextArea().setText(stringBuffer.toString()); //wpisuje na moje pole ktestowe tekst z pliku
                view.setTitle(Controller.TITLE + " - " + file.getAbsolutePath());
                model.setTekst(stringBuffer.toString());
                model.setFile(file);

            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
