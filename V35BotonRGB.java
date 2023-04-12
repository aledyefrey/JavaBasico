import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class V35BotonRGB extends JFrame implements ActionListener{

    private JLabel lbl1, lbl2, lbl3;
    private JComboBox combo1, combo2, combo3;
    private JButton btn1;

    public V35BotonRGB(){

        setLayout(null);

        lbl1 = new JLabel("rojo");
        lbl1.setBounds(10,10,100,10);
        add(lbl1);

        combo1 = new JComboBox();
        combo1.setBounds(120,10,50,30);
        for(int i = 0; i < 255; i++){

            combo1.addItem(String.valueOf(i));
        }
        add(combo1);

        lbl2 = new JLabel("verde");
        lbl2.setBounds(10,50,100,10);
        add(lbl2);

        combo2 = new JComboBox();
        combo2.setBounds(120,50,50,30);
        for(int i = 0; i < 255; i++){

            combo2.addItem(String.valueOf(i));
        }
        add(combo2);

        lbl3 = new JLabel("azul");
        lbl3.setBounds(10,90,100,10);
        add(lbl3);

        combo3 = new JComboBox();
        combo3.setBounds(120,90,50,30);
        for(int i = 0; i < 255; i++){

            combo3.addItem(String.valueOf(i));
        }
        add(combo3);

        btn1 = new JButton("Fijar color");
        btn1.setBounds(10,130,100,30);
        add(btn1);
        btn1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == btn1){

            String cad1 = combo1.getSelectedItem().toString();
            String cad2 = combo2.getSelectedItem().toString();
            String cad3 = combo3.getSelectedItem().toString();

            int rojo = Integer.parseInt(cad1);
            int verde = Integer.parseInt(cad2);
            int azul = Integer.parseInt(cad3);

            Color color1 = new Color(rojo, verde, azul);
            btn1.setBackground(color1);
        }
    }
    public static void main(String args[]){

        V35BotonRGB Formulario1 = new V35BotonRGB();
        Formulario1.setBounds(0,0,400,300);
        Formulario1.setVisible(true);
        Formulario1.setLocationRelativeTo(null);
        Formulario1.setResizable(false);
    }
}