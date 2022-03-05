import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

class FenBoutons extends JFrame implements ActionListener{
    public FenBoutons () {
        setTitle ("Avec deux boutons");
        setSize(300, 200);
        monbouton1 = new JButton ("Bouton 1");
        monbouton2 = new JButton("Bouton 2");
        monbouton3 = new JButton("Bouton 3");
        monbouton4 = new JButton("Bouton 4");
        monbouton5 = new JButton("Bouton 5");
        monbouton6 = new JButton("Bouton 6");
        monbouton7 = new JButton("Bouton 7");
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        contenu.add(monbouton1);
        contenu.add(monbouton2);
        contenu.add(monbouton3);
        contenu.add(monbouton4);
        contenu.add(monbouton5);
        contenu.add(monbouton6);
        contenu.add(monbouton7);
        monbouton1.addActionListener(this);
        monbouton2.addActionListener(this);
        monbouton3.addActionListener(this);
        monbouton4.addActionListener(this);
        monbouton5.addActionListener(this);
        monbouton6.addActionListener(this);
        monbouton7.addActionListener(this);
    }
    public void actionPerformed (ActionEvent ev) {
        //String nom = ev.getActionCommand();
        //System.out.println("Action sur le bouton" + nom);
        if (ev.getSource()==monbouton1){
       
        try {
          Desktop.getDesktop().open(new java.io.File("/home/mhd/Bureau/TpJavaINSA/entree1.txt"));
          Desktop.getDesktop().open(new java.io.File("/home/mhd/Bureau/TpJavaINSA/entree2.txt"));
                }
        catch (Exception e) {
            e.printStackTrace();
        }
       }
       if (ev.getSource()==monbouton2){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le numero de l'etudiant");
        int numero = sc.nextInt();
        System.out.println(numero);
       }
    }
    private JButton monbouton1, monbouton2, monbouton3, monbouton4, monbouton5, monbouton6, monbouton7;
}
public class Bouton4 {
    public static void main (String [] args) {
        FenBoutons fen = new FenBoutons();
        fen.setVisible(true);
    }
}
