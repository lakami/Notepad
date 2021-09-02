package widok;

import javax.swing.*;

public class Adres extends JMenuItem {

    private String poleAdresowe;


    public Adres(String text, String poleAdresowe) {
        super(text);
        this.poleAdresowe = poleAdresowe;

    }

    public void setPoleAdresowe(String poleAdresowe) {
        this.poleAdresowe = poleAdresowe;
    }

    public String getAdres(){
        return poleAdresowe;

    }

}
