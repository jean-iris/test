package visuel;

import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/**
 * @author YOHAN
 * V1 créé le 16/02/2010
 * Cette classe contient:
 * la popup a propos
 */
public class APropos extends JDialog {

    private static final long serialVersionUID = 1L;

    private JPanel jContentPane = null;

    private JButton ok = null;

    private JTextPane auteur = null;

    /**
        * This method initializes ok
        *
        * @return javax.swing.JButton
        */
    private JButton getOk() {
        if (ok == null) {
            ok = new JButton();
            ok.setBounds(new Rectangle(100, 130, 80, 30));
            ok.setMnemonic(KeyEvent.VK_UNDEFINED);
            ok.setText("OK");
            ok.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    //setVisible(false);
                    dispose();
                }
            });
        }
        return ok;
    }

    /**
        *
        */
    public APropos() {
        super();
    }

    /**
        * This method initializes auteur
        *
        * @return javax.swing.JTextPane
        */
    private JTextPane getAuteur() {
        if (auteur == null) {
            auteur = new JTextPane();
            auteur.setEditable(false);
            auteur.setBounds(new Rectangle(15, 10, 260, 110));
            auteur.setText("Réalisé par Yohan Guillet\nVersion 1.0\nCréé le 16/02/2010");
        }
        return auteur;
    }

    /**
        * @param owner
        */
    public APropos(Frame owner) {
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
        this.setTitle("A propos de");
        this.setResizable(false);
        this.setContentPane(getJContentPane());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
        * This method initializes jContentPane
        *
        * @return javax.swing.JPanel
        */
    private JPanel getJContentPane() {
        if (jContentPane == null) {
            jContentPane = new JPanel();
            jContentPane.setLayout(null);
            jContentPane.add(getOk(), null);
            jContentPane.add(getAuteur(), null);
        }
        return jContentPane;
    }

}
