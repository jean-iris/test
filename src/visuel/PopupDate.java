package visuel;

import arbreGene.DateUtil;
import java.awt.Frame;
import java.awt.Rectangle;
import javax.swing.*;

/**
 * @author YOHAN
 * V1
 * Cette classe contient:
 * la popup modification des dates
 */
public class PopupDate extends JDialog {
    //TODO 3 implémenter les indices
    private DateUtil dateU;
    private DateUtil dat;
    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;
    private JRadioButton boutonConnu = null;
    private JRadioButton boutonInconnu = null;
    private ButtonGroup groupBouton = null;  //  @jve:decl-index=0:
    private JTextPane textConnu = null;
    private JTextPane textInconnu = null;
    private JButton boutonOK = null;
    private JButton boutonAnnulation = null;
    private JTextField zoneDateSimple = null;
    private JTextField zoneDateDebut = null;
    private JTextField zoneDateFin = null;
    private JTextPane textDateSimple = null;
    private JTextPane textDateDebut = null;
    private JTextPane textDateFin = null;

    /**
        * This method initializes this
        *
        * @return void
        */
    private void initialize() {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            this.setSize(355, 316);
            this.setContentPane(getJContentPane());
            zoneDateSimple.setText(dateU.getDateSimple());
            zoneDateDebut.setText(dateU.getDateDebut());
            zoneDateFin.setText(dateU.getDateFin());
            if (dateU.isConnus())
            {
                    boutonConnu.setSelected(true);
            } else
            {
                    boutonInconnu.setSelected(true);
            }
    }

    /**
        * Constructeur
        */
    public PopupDate() {
            super();
    }

    /**
        * Constructeur paramétré
        */
    public PopupDate(Frame owner, DateUtil dat, String titre) {
            super(owner, true);
            this.setTitle(titre);
            this.dat = dat;
            if ( dat == null )
            {
                    this.dateU = new DateUtil();
            } else
            {
                    this.dateU = new DateUtil(this.dat);
            }

            initialize();
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
                    jContentPane.add(getBoutonConnu(), null);
                    jContentPane.add(getBoutonInconnu(), null);
                    getGroupBouton();
                    jContentPane.add(getTextConnu(), null);
                    jContentPane.add(getTextInconnu(), null);
                    jContentPane.add(getBoutonOK(), null);
                    jContentPane.add(getBoutonAnnulation(), null);
                    jContentPane.add(getZoneDateSimple(), null);
                    jContentPane.add(getZoneDateDebut(), null);
                    jContentPane.add(getZoneDateFin(), null);
                    jContentPane.add(getTextDateSimple(), null);
                    jContentPane.add(getTextDateDebut(), null);
                    jContentPane.add(getTextDateFin(), null);
            }
            return jContentPane;
    }

    /**
        * This method initializes boutonConnu
        *
        * @return javax.swing.JRadioButton
        */
    private JRadioButton getBoutonConnu() {
            if (boutonConnu == null) {
                    boutonConnu = new JRadioButton();
                    boutonConnu.setBounds(new Rectangle(9, 9, 22, 18));
                    boutonConnu.addItemListener(new changeBouton());
            }
            return boutonConnu;
    }

    /**
        * This method initializes boutonInconnu
        *
        * @return javax.swing.JRadioButton
        */
    private JRadioButton getBoutonInconnu() {
            if (boutonInconnu == null) {
                    boutonInconnu = new JRadioButton();
                    boutonInconnu.setBounds(new Rectangle(14, 109, 22, 22));
                    boutonInconnu.addItemListener(new changeBouton());
            }
            return boutonInconnu;
    }

    private ButtonGroup getGroupBouton() {
            if (groupBouton == null) {
                    groupBouton = new ButtonGroup();
                    groupBouton.add(getBoutonConnu());
                    groupBouton.add(getBoutonInconnu());
            }
            return groupBouton;
    }


    /**
        * This method initializes textConnu
        *
        * @return javax.swing.JTextPane
        */
    private JTextPane getTextConnu() {
            if (textConnu == null) {
                    textConnu = new JTextPane();
                    textConnu.setBounds(new Rectangle(36, 6, 119, 30));
                    textConnu.setText("Date exacte connu");
            }
            return textConnu;
    }

    /**
        * This method initializes textInconnu
        *
        * @return javax.swing.JTextPane
        */
    private JTextPane getTextInconnu() {
            if (textInconnu == null) {
                    textInconnu = new JTextPane();
                    textInconnu.setBounds(new Rectangle(37, 107, 132, 29));
                    textInconnu.setText("Date exacte inconnu");
            }
            return textInconnu;
    }

    /**
        * This method initializes boutonOK
        *
        * @return javax.swing.JButton
        */
    private JButton getBoutonOK() {
        if (boutonOK == null) {
            boutonOK = new JButton();
            boutonOK.setBounds(new Rectangle(54, 249, 93, 24));
            boutonOK.setText("Valider");
            boutonOK.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    dateU.setDateConnus(zoneDateSimple.getText());
                    dateU.setDateDebut(zoneDateDebut.getText());
                    dateU.setDateFin(zoneDateFin.getText());
                    dat.remplacer(dateU);
                    dispose();
                }
            });
        }
        return boutonOK;
    }

    /**
        * This method initializes boutonAnnulation
        *
        * @return javax.swing.JButton
        */
    private JButton getBoutonAnnulation() {
        if (boutonAnnulation == null) {
            boutonAnnulation = new JButton();
            boutonAnnulation.setBounds(new Rectangle(169, 250, 84, 25));
            boutonAnnulation.setText("Annuler");
            boutonAnnulation.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    dispose();
                }
            });
        }
        return boutonAnnulation;
    }

    /**
        * This method initializes zoneDateSimple
        *
        * @return javax.swing.JTextField
        */
    private JTextField getZoneDateSimple() {
        if (zoneDateSimple == null) {
            zoneDateSimple = new JTextField();
            zoneDateSimple.setBounds(new Rectangle(79, 47, 82, 30));
        }
        return zoneDateSimple;
    }

    /**
        * This method initializes zoneDateDebut
        *
        * @return javax.swing.JTextField
        */
    private JTextField getZoneDateDebut() {
        if (zoneDateDebut == null) {
            zoneDateDebut = new JTextField();
            zoneDateDebut.setBounds(new Rectangle(92, 150, 78, 26));
        }
        return zoneDateDebut;
    }

    /**
        * This method initializes zoneDateFin
        *
        * @return javax.swing.JTextField
        */
    private JTextField getZoneDateFin() {
        if (zoneDateFin == null) {
            zoneDateFin = new JTextField();
            zoneDateFin.setBounds(new Rectangle(216, 150, 93, 27));
        }
        return zoneDateFin;
    }

    /**
        * This method initializes textDateSimple
        *
        * @return javax.swing.JTextPane
        */
    private JTextPane getTextDateSimple() {
        if (textDateSimple == null) {
            textDateSimple = new JTextPane();
            textDateSimple.setBounds(new Rectangle(20, 46, 52, 30));
            textDateSimple.setText("Date :");
        }
        return textDateSimple;
    }

    /**
        * This method initializes textDateDebut
        *
        * @return javax.swing.JTextPane
        */
    private JTextPane getTextDateDebut() {
        if (textDateDebut == null) {
            textDateDebut = new JTextPane();
            textDateDebut.setBounds(new Rectangle(6, 151, 86, 28));
            textDateDebut.setText("Date entre le ");
        }
        return textDateDebut;
    }

    /**
        * This method initializes textDateFin
        *
        * @return javax.swing.JTextPane
        */
    private JTextPane getTextDateFin() {
        if (textDateFin == null) {
            textDateFin = new JTextPane();
            textDateFin.setBounds(new Rectangle(174, 150, 35, 30));
            textDateFin.setText("et le");
        }
        return textDateFin;
    }

    private class changeBouton implements java.awt.event.ItemListener {
        @Override
        public void itemStateChanged(java.awt.event.ItemEvent e) {
            if (boutonConnu.isSelected()) {
                dateU.setConnus(true);
                zoneDateSimple.setVisible(true);
                textDateSimple.setVisible(true);
                zoneDateDebut.setVisible(false);
                textDateDebut.setVisible(false);
                zoneDateFin.setVisible(false);
                textDateFin.setVisible(false);
            } else
            {
                dateU.setConnus(false);
                zoneDateSimple.setVisible(false);
                textDateSimple.setVisible(false);
                zoneDateDebut.setVisible(true);
                textDateDebut.setVisible(true);
                zoneDateFin.setVisible(true);
                textDateFin.setVisible(true);
            }
        }
    }

}  //  @jve:decl-index=0:visual-constraint="10,10"
