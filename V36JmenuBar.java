import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class V36JmenuBar extends JFrame implements ActionListener{

    private JMenuBar menubar;
    private JMenu menu1;
    private JMenuItem item1, item2, item3;

    public V36JmenuBar(){

        setLayout(null);

        menubar = new JMenuBar();
        setJMenuBar(menubar); // colocar la barra

        menu1 = new JMenu("Opciones");
        menubar.add(menu1);

        item1 = new JMenuItem("Rojo");
        item1.addActionListener(this);
        menu1.add(item1);

        item2 = new JMenuItem("Verde");
        item2.addActionListener(this);
        menu1.add(item2);

        item3 = new JMenuItem("Azul");
        item3.addActionListener(this);
        menu1.add(item3);
    }
    public void actionPerformed(ActionEvent e){

        Container fondo = this.getContentPane();
        if(e.getSource() == item1){

            fondo.setBackground(new Color(255,0,0));
        } else if(e.getSource() == item2){

            fondo.setBackground(new Color(0,255,0));
        } else if(e.getSource() == item3){

            fondo.setBackground(new Color(0,0,255));
        }
    }
    public static void main(String args[]){

        V36JmenuBar Formulario1 = new V36JmenuBar();
        Formulario1.setBounds(0,0,400,500);
        Formulario1.setVisible(true);
        Formulario1.setResizable(true);
        Formulario1.setLocationRelativeTo(null);
    }
}