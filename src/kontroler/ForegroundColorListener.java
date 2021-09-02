package kontroler;

import model.Model;
import widok.JRadioColorButton;

import javax.swing.*;
import java.awt.*;

public class ForegroundColorListener extends ColorListener {
    @Override
    protected Color getModelPreviousColor() {
        return model.getTextColorPrevious();
    }

    @Override
    protected void setjTextAreaColor(Color color) {
        jTextArea.setForeground(color);
    }

    @Override
    protected void setModelPreviousColor(Color color) {
        model.setTextColorPrevious(color);
    }

    public ForegroundColorListener(JLabel jLabel, JTextArea jTextArea, Model model, JRadioColorButton button) {
        super(jLabel, jTextArea, model, button);
    }
}
