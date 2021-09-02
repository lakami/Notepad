package widok;

import javax.swing.*;

public class MidPanel extends JScrollPane {
    public MidPanel() {

        super(new JTextArea());
        this.jTextArea = (JTextArea) this.getViewport().getView(); //poberam widok ze JScrollPane
        jTextArea.setEditable(true); // mozna recznie dopisywać

    }
    private JTextArea jTextArea;

    public JTextArea getjTextArea(){
        return jTextArea;}

}
