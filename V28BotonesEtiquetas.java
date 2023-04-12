import javax.swing.*;
import java.awt.event.*;

public class V28BotonesEtiquetas extends JFrame implements ActionListener{

    private JButton btn1, btn2, btn3;
    private JLabel lbl1;

    public V28BotonesEtiquetas(){

        setLayout(null);

        btn1 = new JButton("1");
        btn1.setBounds(10,100,90,30);
        add(btn1);
        btn1.addActionListener(this);

        btn2 = new JButton("2");
        btn2.setBounds(110,100,90,30);
        add(btn2);
        btn2.addActionListener(this);

        btn3 = new JButton("3");
        btn3.setBounds(210,100,90,30);
        add(btn3);
        btn3.addActionListener(this);

        lbl1 = new JLabel("En espera...");
        lbl1.setBounds(10,10,300,30);
        add(lbl1);
    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == btn1){

            lbl1.setText("haz precionado el boton 1");
        } else if(e.getSource() == btn2){

            lbl1.setText("Haz precionado el boton 2");
        } else if(e.getSource() == btn3){

            lbl1.setText("Haz precionado el boton 3");
        }
    }
    public static void main(String args[]){

        V28BotonesEtiquetas Formulario1 = new V28BotonesEtiquetas();
        Formulario1.setBounds(0,0,350,200);
        Formulario1.setVisible(true);
        Formulario1.setResizable(false);
        Formulario1.setLocationRelativeTo(null);
    }
}