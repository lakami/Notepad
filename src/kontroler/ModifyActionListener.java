package kontroler;

import model.Model;
import widok.View;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ModifyActionListener implements DocumentListener {

    private View view;

    public ModifyActionListener(View view, Model model) {
        this.view = view;
        this.model = model;
    }


    private Model model;

    @Override
    public void insertUpdate(DocumentEvent e) {
        changeStatus();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        changeStatus();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        changeStatus();
    }

    private void changeStatus(){
        String tekst = view.getMp().getjTextArea().getText();
        if (!tekst.equals(model.getTekst()) ){
            // jeśli tekst w polu jest różny od tego co jest w modelu
            // tekst w modelu zmieniamy jedynie podczas zapisu lub podczas wczytania
            view.getBp().getjLabelState().setText("modified");

        }
        else view.getBp().getjLabelState().setText(model.getStatus()); // biore poprzedni status z modelu
    }


}
