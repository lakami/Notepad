package kontroler;

import model.Model;
import widok.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveAsActionListener implements ActionListener {
    protected View view;
    protected Model model;
    protected JFileChooser jFileChooser;

    public SaveAsActionListener(View view, Model model, JFileChooser jFileChooser) {
        this.view = view;
        this.model = model;
        this.jFileChooser = jFileChooser;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var result = jFileChooser.showSaveDialog(view); // otwieram okno zapisu jFileChoosera
        if (result == JFileChooser.APPROVE_OPTION){
            File file = jFileChooser.getSelectedFile();
            String tekstZNotatnika = view.getMp().getjTextArea().getText();
            saveText(file, tekstZNotatnika);

        }

    }

    protected void saveText(File file, String tekstZNotatnika) {

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(tekstZNotatnika);
            view.getBp().getjLabelState().setText("saved");
            view.setTitle(Controller.TITLE + " - " + file.getAbsolutePath());
            model.setFile(file);

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}
