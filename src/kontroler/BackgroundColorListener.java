package kontroler;

import model.Model;
import widok.JRadioColorButton;

import javax.swing.*;
import java.awt.*;

public class BackgroundColorListener extends ColorListener {
    public BackgroundColorListener(JLabel jLabel, JTextArea jTextArea, Model model, JRadioColorButton button) {
        super(jLabel, jTextArea, model, button);

    }

    @Override
    protected Color getModelPreviousColor() {
        return model.getBackroundColorPrevious();
    }

    @Override
    protected void setjTextAreaColor(Color color) {
        jTextArea.setBackground(color);
    }

    @Override
    protected void setModelPreviousColor(Color color) {
        model.setBackroundColorPrevious(color);
    }
}
