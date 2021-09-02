package kontroler;

import model.Model;
import widok.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SaveActionListener extends SaveAsActionListener {
    public SaveActionListener(View view, Model model, JFileChooser jFileChooser) {
        super(view, model, jFileChooser);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (model.getFile() == null) {
            super.actionPerformed(e);
        } else {
            saveText(model.getFile(), view.getMp().getjTextArea().getText());
        }
    }
}
