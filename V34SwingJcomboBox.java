import javax.swing.*;
import java.awt.event.*;

public class V34SwingJcomboBox extends JFrame implements ItemListener{

    private JComboBox combo1;

    public V34SwingJcomboBox(){

        setLayout(null);

        combo1 = new JComboBox();
        combo1.setBounds(10,10,80,20);
        add(combo1);
        combo1.addItem("rojo");
        combo1.addItem("verde");
        combo1.addItem("azul");
        combo1.addItem("amarillo");
        combo1.addItem("negro");
        combo1.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e){

        if(e.getSource() == combo1){

            String text = combo1.getSelectedItem().toString();
            setTitle(text);
        }
    }
    public static void main(String args[]){

        V34SwingJcomboBox Formulario1 = new V34SwingJcomboBox();
        Formulario1.setBounds(0,0,400,300);
        Formulario1.setVisible(true);
        Formulario1.setResizable(false);
        Formulario1.setLocationRelativeTo(null);
    }
}