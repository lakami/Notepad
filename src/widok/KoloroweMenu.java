package widok;

import javax.swing.*;
import javax.swing.text.html.StyleSheet;
import java.awt.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class KoloroweMenu extends JMenu {

    ButtonGroup buttonGroup;

    public KoloroweMenu(String s, String[] colors) {
        super(s);
        buttonGroup = new ButtonGroup();
        this.prepButtons(colors);
        getItems();
    }

    public void prepButtons(String[] colors){ //metoda
        StyleSheet styleSheet = new StyleSheet();
        for (String color : colors) {
            Color c = styleSheet.stringToColor(color); //zamiana String na Color
            JRadioColorButton jRadioButtonMenuItem = new JRadioColorButton(color, new Circle(c), c);
            this.add(jRadioButtonMenuItem);
            buttonGroup.add(jRadioButtonMenuItem);
            jRadioButtonMenuItem.setForeground(c); //ustawiam kolor tekstu przycisku

        }
    }

    public Stream<JRadioColorButton> getItems() { // zwracam liste referencji do elementów menu
        return Arrays.stream( //zamieniem tablice na stream
                this.getMenuComponents()) // metoda zwraca tablice obiektów klacy Component, które są podmenu widok.KoloroweMenu (this)
                    .map(element -> (JRadioColorButton) element); //mapuje każd z elementów stream na widok.JRadioColorButton
        //zwracam streama


    }

}
