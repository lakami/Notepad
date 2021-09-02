import kontroler.Controller;
import model.Model;
import widok.View;

import javax.swing.*;

public class Main {
    public Main() {
        SwingUtilities.invokeLater(() -> {
            View view = new View();
            Model model = new Model();
            Controller controller = new Controller(view, model);
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
