package kontroler;

import model.Model;
import widok.Adres;
import widok.FontMenuItem;
import widok.View;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Controller {
    private View view;
    private Model model;
    protected static final String TITLE = "Prosty edytor";

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        model.setBackroundColorPrevious(Color.white);
        model.setAddressHome(" ul. Księcia Janusza 38-364 Warszawa");
        model.setAddressWork(" ul. Grażyny 11-222 Radom");
        model.setAddressSchool(" ul. Garażowa 44-555 Sosnowiec");
        view.getPraca().setPoleAdresowe(model.getAddressWork());
        view.getDom().setPoleAdresowe(model.getAddressHome());
        view.getSzkola().setPoleAdresowe(model.getAddressSchool());
        initView();
        initController();
    }

    private void initView(){
        this.view.setTitle(TITLE + " - bez tytulu");
    }

    private void initController(){ //ustawiam wszytkie akcje
        JFileChooser jFileChooser = new JFileChooser(); //otwieranie zamykanie plików
        view.getOpen().addActionListener(new OpenActionListener(view,model, jFileChooser));
        view.getExit().addActionListener(new ExitActionListener());
        view.getSaveAs().addActionListener(new SaveAsActionListener(view, model, jFileChooser));
        view.getSave().addActionListener(new SaveActionListener(view, model, jFileChooser));

        JTextArea jTextArea = view.getMp().getjTextArea();
        jTextArea.getDocument().addDocumentListener(new ModifyActionListener(view, model));

        Adres praca = view.getPraca();
        Adres dom = view.getDom();
        Adres szkola = view.getSzkola();

        praca.addActionListener(new InsertAddressActionListener(jTextArea, praca));
        dom.addActionListener(new InsertAddressActionListener(jTextArea, dom));
        szkola.addActionListener(new InsertAddressActionListener(jTextArea, szkola));


        var backroundItems = view.getBg().getItems(); //zwraca streama przycisków
        backroundItems.forEach(element -> {
            element
                    .addActionListener(
                            new BackgroundColorListener(view.getBp().getjLabelBG(), jTextArea, model, element )
                    );
        });

        var foregroundItems = view.getFg().getItems(); //zwraca streama przycisków
        foregroundItems.forEach(element -> {
            element
                    .addActionListener(
                            new ForegroundColorListener(view.getBp().getjLabelFG(), jTextArea, model, element )
                    );
        });

        Arrays.stream(view.getFs().getMenuComponents())
                .map(element -> (FontMenuItem) element)
                .forEach(element -> element.addActionListener(new FontSizeListener(element, view.getBp().getjLabelSize(), jTextArea)));

    }

}
