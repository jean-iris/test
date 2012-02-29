package visuel;

import java.awt.BorderLayout;
import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class PopupParam extends JDialog {
    //TODO 2 popup paramètre a faire
    //TODO 2 langue, couleur font, type d'écriture,...
    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;

    public PopupParam() {
        super();
        initialize();
    }

    public PopupParam(Frame owner) {
        super(owner, true);
        initialize();
    }

    /**
        * This method initializes this
        *
        * @return void
        */
    private void initialize() {
        this.setSize(300, 200);
        this.setTitle("Param�tres");
        this.setContentPane(getJContentPane());
    }

    /**
        * This method initializes jContentPane
        *
        * @return javax.swing.JPanel
        */
    private JPanel getJContentPane() {
        if (jContentPane == null) {
            jContentPane = new JPanel();
            jContentPane.setLayout(new BorderLayout());
        }
        return jContentPane;
    }

}
