package widok;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class View extends JFrame {
    //referencje do obiektów, aby dodac obsługę zdarzeń
    private JMenuItem open;
    private JMenuItem save;
    private JMenuItem saveAs;
    private JMenuItem exit;
    private KoloroweMenu fg; // bo potrzebuje pobrać elementy getterem, aby przypisac w kontrolerze akcje do tego obiektu
    private KoloroweMenu bg;
    private FontSize fs;
    private MidPanel mp;
    private BottomPanel bp;
    private Adres praca;
    private Adres dom;
    private Adres szkola;

    public Adres getPraca() {
        return praca;
    }

    public Adres getDom() {
        return dom;
    }

    public Adres getSzkola() {
        return szkola;
    }

    public View() {

        JMenuBar jMenuBar = new JMenuBar();


       //FILE
        JMenu file = new JMenu("File");

        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        saveAs = new JMenuItem("Save As");
        exit = new JMenuItem("Exit");

        file.add(open);
        file.add(save);
        file.add(saveAs);
        JPopupMenu.Separator separator = new JPopupMenu.Separator();
        separator.setBackground(Color.red);
        file.add(separator);
        file.add(exit);

        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        saveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));


        //EDIT
        JMenu edit = new JMenu("Edit");

        JMenu adresy = new JMenu("Adresy");

        edit.add(adresy);

        praca = new Adres("Praca", "");
        dom = new Adres("Dom", "");
        szkola = new Adres("Szkoła", "");

        adresy.add(praca);
        adresy.add(dom);
        adresy.add(szkola);

        praca.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_DOWN_MASK + InputEvent.SHIFT_DOWN_MASK));
        dom.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK + InputEvent.SHIFT_DOWN_MASK));
        szkola.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK + InputEvent.SHIFT_DOWN_MASK));

        //OPTIONS
        JMenu options = new JMenu("Options");


        String[] kolory = new String[]{"Green", "Orange", "Red", "Black", "White", "Yellow", "Blue"};
        fg = new KoloroweMenu("Foreground", kolory );
        options.add(fg);

        bg = new KoloroweMenu("Background", kolory);
        options.add(bg);

        int[] fontSizes = new int[]{8, 10, 12, 14, 16, 18, 20, 22, 24};
        fs = new FontSize("Font Size", fontSizes);
        options.add(fs);


        jMenuBar.add(file);
        jMenuBar.add(edit);
        jMenuBar.add(options);

        //mid panel

        mp = new MidPanel();

        //bottom panel

        bp = new BottomPanel();


        //Layout cała ramka
        this.setLayout(new BorderLayout());
        this.add(mp, BorderLayout.CENTER);
        this.add(bp, BorderLayout.SOUTH);



        this.setJMenuBar(jMenuBar);
        this.setSize(500,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public JMenuItem getOpen() {
        return open;
    }

    public JMenuItem getSave() {
        return save;
    }

    public JMenuItem getSaveAs() {
        return saveAs;
    }

    public JMenuItem getExit() {
        return exit;
    }

    public KoloroweMenu getFg() {
        return fg;
    }

    public KoloroweMenu getBg() {
        return bg;
    }

    public FontSize getFs() {
        return fs;
    }

    public MidPanel getMp() {
        return mp;
    }

    public BottomPanel getBp() {
        return bp;
    }
}
