import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class V37Submenu extends JFrame implements ActionListener{

    private JMenuBar barra;
    private JMenu menu1, menu2, menu3;
    private JMenuItem item1, item2, item3, item4;

    public V37Submenu(){

        setLayout(null);

        barra = new JMenuBar();
        setJMenuBar(barra);

        menu1 = new JMenu("Opciones");
        barra.add(menu1);

        menu2 = new JMenu("Tamaño");
        menu1.add(menu2);

        menu3 = new JMenu("Color");
        menu1.add(menu3);

        item1 = new JMenuItem("300*200");
        menu2.add(item1);
        item1.addActionListener(this);

        item2 = new JMenuItem("640*480");
        menu2.add(item2);
        item2.addActionListener(this);

        item3 = new JMenuItem("Rojo");
        menu3.add(item3);
        item3.addActionListener(this);

        item4 = new JMenuItem("Verde");
        menu3.add(item4);
        item4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == item1){

            setSize(300,200);
        } else if(e.getSource() == item2){

            setSize(640,480);
        } else if(e.getSource() == item3){

            getContentPane().setBackground(new Color(255,0,0));
        } else if(e.getSource() == item4){

            getContentPane().setBackground(new Color(0,255,0));
        }
    }
    public static void main(String args[]){

        V37Submenu Formulario1 = new V37Submenu();
        Formulario1.setBounds(0,0,300,200);
        Formulario1.setVisible(true);
        Formulario1.setResizable(false);
        Formulario1.setLocationRelativeTo(null);
    }
}



















