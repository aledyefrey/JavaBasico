import javax.swing.*;
import java.awt.event.*;

public class V27SwingJbutton extends JFrame implements ActionListener{

    private JButton btn1;

    public V27SwingJbutton(){

        setLayout(null);
        btn1 = new JButton("Cerrar");
        btn1.setBounds(300,250,100,30);
        add(btn1);
        btn1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == btn1){

            System.exit(0);
        }
    }
    public static void main(String args[]){

        V27SwingJbutton Formulario1 = new V27SwingJbutton();
        Formulario1.setBounds(0,0,450,350);
        Formulario1.setVisible(true);
        Formulario1.setResizable(false);
        Formulario1.setLocationRelativeTo(null);
    }
}