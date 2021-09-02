package widok;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class BottomPanel extends JPanel {
   private JLabel jLabelFG;
   private JLabel jLabelBG;
   private JLabel jLabelSize;
   private JLabel jLabelState;

    public JLabel getjLabelFG() {
        return jLabelFG;
    }

    public JLabel getjLabelBG() {
        return jLabelBG;
    }

    public JLabel getjLabelSize() {
        return jLabelSize;
    }

    public JLabel getjLabelState() {
        return jLabelState;
    }

    public BottomPanel() {
        this.jLabelFG = new JLabel("fg");
        this.jLabelBG = new JLabel("bg");
        this.jLabelSize = new JLabel("size");
        this.jLabelState = new JLabel("new");

        JPanel lewyPanel = new JPanel();
        GridLayout layout = new GridLayout(1, 0);
        layout.setHgap(10); //przerwa pomiedzy kolumnami
        lewyPanel.setLayout(layout);

        lewyPanel.add(jLabelFG);
        lewyPanel.add(jLabelBG);
        lewyPanel.add(jLabelSize);

        this.setLayout(new BorderLayout());
        this.add(lewyPanel, BorderLayout.LINE_START);
        this.add(jLabelState, BorderLayout.LINE_END);
        this.setBorder(new EmptyBorder(5,10,5,10));

    }
}
