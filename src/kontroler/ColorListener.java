package kontroler;

import model.Model;
import widok.Circle;
import widok.JRadioColorButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class ColorListener implements ActionListener {

    private JLabel jLabel;
    protected JTextArea jTextArea;
    protected Model model;
    private JRadioColorButton button;

    @Override
    public void actionPerformed(ActionEvent e) {
        Color nowyKolor = button.getColor(); //pobiram kolor z wciśniętego elementu menu
        Color poprzedniKolor = getModelPreviousColor(); //pobieram poprzedni kolor
        setjTextAreaColor(nowyKolor);
        jLabel.setIcon(new Circle(poprzedniKolor));
        setModelPreviousColor(nowyKolor); // w kolejny evencie ten kolor bedzie starym kolorem
    }

    protected abstract Color getModelPreviousColor(); //metoda ta decyduje jaki kolor poboerany jest skąd,
    // dlatego w klasach rozszerzających trzeba zdefiniować działanie tej metody

    protected abstract void setjTextAreaColor(Color color); // ustawianie kolor jTextArea,
    // przedefiniowanie tej metody powie w jaki sposób to zrobić

    protected abstract void setModelPreviousColor(Color color);

    public ColorListener(JLabel jLabel, JTextArea jTextArea, Model model, JRadioColorButton button) {
        this.jLabel = jLabel;
        this.jTextArea = jTextArea;
        this.model = model;
        this.button = button;
    }
}
